.PHONY: all compile go-tidy go-init clean java-jar

all: clean compile go-init go-tidy java-jar documentation
comma:=

compile:
	protoc -I ./protos -I /usr/local/include --go_opt=module=github.com/cyverse-de/p/go --go_out=./go protos/*.proto
	protoc -I ./protos -I /usr/local/include --java_out=./java protos/*.proto
	protoc -I ./protos -I /usr/local/include \
		--prost_opt=default_package_filename=gen.rs \
		--prost_opt=compile_well_known_types \
		--prost_opt=extern_path=.google.protobuf=::pbjson_types \
		--prost_opt=message_attribute=.='#[derive(validator::Validate)]' \
		--prost_opt=type_attribute=lookup_ids='#[derive(validator::Validate)]' \
		--prost_opt=field_attribute=id='#[validate(custom = "crate::custom_validator::validate_uuid")]' \
		--prost_opt=field_attribute=subscription_id='#[validate(custom = "crate::custom_validator::validate_uuid")]' \
		--prost_opt=field_attribute=plan_id='#[validate(custom = "crate::custom_validator::validate_uuid")]' \
		--prost_opt=field_attribute=AnalysisSubmission.user_id='#[validate(custom = "crate::custom_validator::validate_uuid")]' \
		--prost_opt=field_attribute=Job.user_id='#[validate(custom = "crate::custom_validator::validate_uuid")]' \
		--prost_opt=field_attribute=RequestByUserID.user_id='#[validate(custom = "crate::custom_validator::validate_uuid")]' \
		--prost_opt=field_attribute=ByUserID.user_id='#[validate(custom = "crate::custom_validator::validate_uuid")]' \
		--prost_opt=field_attribute=ByUUIDAndUserID.user_id='#[validate(custom = "crate::custom_validator::validate_uuid")]' \
		--prost_opt=field_attribute=analysis_id='#[validate(custom = "crate::custom_validator::validate_uuid")]' \
		--prost_opt=field_attribute=uuid='#[validate(custom = "crate::custom_validator::validate_uuid")]' \
		--prost_opt=field_attribute=plan_uuid='#[validate(custom = "crate::custom_validator::validate_uuid")]' \
		--prost_opt=field_attribute=parent_uuid='#[validate(custom = "crate::custom_validator::validate_uuid")]' \
		--prost_opt=field_attribute=child_uuid='#[validate(custom = "crate::custom_validator::validate_uuid")]' \
		--prost_opt=field_attribute=url='#[validate(url)]' \
		--prost_opt=field_attribute=cas_url='#[validate(url)]' \
		--prost_opt=field_attribute=frontend_url='#[validate(url)]' \
		--prost_opt=field_attribute=backend_url='#[validate(url)]' \
		--prost_out=debuff/src/ \
		--prost-serde_out=debuff/src \
		protos/*.proto

documentation:
	protoc -I ./protos -I /usr/local/include --doc_out=./docs --doc_opt=markdown,analysis.md protos/analysis_*.proto
	protoc -I ./protos -I /usr/local/include --doc_out=./docs --doc_opt=markdown,monitoring.md protos/monitoring_*.proto
	protoc -I ./protos -I /usr/local/include --doc_out=./docs --doc_opt=markdown,qms.md protos/qms_*.proto
	protoc -I ./protos -I /usr/local/include --doc_out=./docs --doc_opt=markdown,common.md protos/header.proto protos/svcerror.proto
	protoc -I ./protos -I /usr/local/include --doc_out=./docs --doc_opt=markdown,users.md protos/user.proto protos/user_requests.proto
	protoc -I ./protos -I /usr/local/include --doc_out=./docs --doc_opt=markdown,requests.md protos/requests.proto
	

java-jar:
	lein jar

go-init:
	cd ./go/analysis && go mod init github.com/cyverse-de/p/go/analysis
	cd ./go/user && go mod init github.com/cyverse-de/p/go/user
	cd ./go/svcerror && go mod init github.com/cyverse-de/p/go/svcerror
	cd ./go/header && go mod init github.com/cyverse-de/p/go/header
	cd ./go/qms && go mod init github.com/cyverse-de/p/go/qms
	cd ./go/monitoring && go mod init github.com/cyverse-de/p/go/monitoring
	cd ./go/requests && go mod init github.com/cyverse-de/p/go/requests

go-tidy:
	cd ./go/analysis && go mod tidy
	cd ./go/user && go mod tidy
	cd ./go/svcerror && go mod tidy
	cd ./go/header && go mod tidy
	cd ./go/qms && go mod tidy
	cd ./go/monitoring && go mod tidy
	cd ./go/requests && go mod tidy

clean:
	rm -rf ./go/*
	rm -rf ./java/*
	rm -rf ./docs/*
	rm ./debuff/src/debuff.rs
	rm ./debuff/src/debuff.serde.rs
	lein clean

godirs: $(ls ./go/)
