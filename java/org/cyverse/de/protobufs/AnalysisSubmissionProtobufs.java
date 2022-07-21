// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: analysis_submission.proto

package org.cyverse.de.protobufs;

public final class AnalysisSubmissionProtobufs {
  private AnalysisSubmissionProtobufs() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HTCondorExtraInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HTCondorExtraInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Extra_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Extra_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FileMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FileMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Step_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Step_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Step_Component_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Step_Component_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Step_Param_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Step_Param_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Step_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Step_Config_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Step_Input_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Step_Input_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Step_Output_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Step_Output_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Step_EnvironmentEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Step_EnvironmentEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AnalysisSubmission_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AnalysisSubmission_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Job_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Job_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031analysis_submission.proto\032\037google/prot" +
      "obuf/timestamp.proto\032\030analysis_container" +
      ".proto\032\014header.proto\"/\n\021HTCondorExtraInf" +
      "o\022\032\n\022extra_requirements\030\001 \001(\t\".\n\005Extra\022%" +
      "\n\tht_condor\030\001 \001(\0132\022.HTCondorExtraInfo\">\n" +
      "\014FileMetadata\022\021\n\tattribute\030\001 \001(\t\022\r\n\005valu" +
      "e\030\002 \001(\t\022\014\n\004unit\030\003 \001(\t\"\234\010\n\004Step\022\"\n\tcompon" +
      "ent\030\001 \001(\0132\017.Step.Component\022\034\n\006config\030\002 \001" +
      "(\0132\014.Step.Config\022\014\n\004type\030\003 \001(\t\022\031\n\nstdin_" +
      "path\030\004 \001(\tR\005stdin\022\033\n\013stdout_path\030\005 \001(\tR\006" +
      "stdout\022\033\n\013stderr_path\030\006 \001(\tR\006stderr\022\032\n\010l" +
      "og_file\030\007 \001(\tR\010log-file\022+\n\013environment\030\010" +
      " \003(\0132\026.Step.EnvironmentEntry\022\032\n\005input\030\t " +
      "\003(\0132\013.Step.Input\022\034\n\006output\030\n \003(\0132\014.Step." +
      "Output\022\027\n\006header\030\013 \001(\0132\007.Header\032\316\001\n\tComp" +
      "onent\022\035\n\tcontainer\030\001 \001(\0132\n.Container\022\014\n\004" +
      "type\030\002 \001(\t\022\014\n\004name\030\003 \001(\t\022\020\n\010location\030\004 \001" +
      "(\t\022\023\n\013description\030\005 \001(\t\022&\n\ntime_limit\030\006 " +
      "\001(\005R\022time_limit_seconds\022\022\n\nrestricted\030\007 " +
      "\001(\010\022#\n\016is_interactive\030\010 \001(\010R\013interactive" +
      "\032[\n\005Param\022\n\n\002id\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\r\n\005v" +
      "alue\030\003 \001(\t\022\r\n\005order\030\004 \001(\005\022\014\n\004type\030\005 \001(\t\022" +
      "\014\n\004path\030\006 \001(\t\032p\n\006Config\022\033\n\006params\030\001 \003(\0132" +
      "\013.Step.Param\022\"\n\006inputs\030\002 \003(\0132\013.Step.Inpu" +
      "tR\005input\022%\n\007outputs\030\003 \003(\0132\014.Step.OutputR" +
      "\006output\032\206\001\n\005Input\022\n\n\002id\030\001 \001(\t\022\016\n\006ticket\030" +
      "\002 \001(\t\022\024\n\014multiplicity\030\003 \001(\t\022\014\n\004name\030\004 \001(" +
      "\t\022\020\n\010property\030\005 \001(\t\022\016\n\006retain\030\006 \001(\010\022\014\n\004t" +
      "ype\030\007 \001(\t\022\r\n\005value\030\010 \001(\t\032v\n\006Output\022\024\n\014mu" +
      "ltiplicity\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\020\n\010proper" +
      "ty\030\003 \001(\t\022\030\n\007qual_id\030\004 \001(\tR\007qual-id\022\016\n\006re" +
      "tain\030\005 \001(\010\022\014\n\004type\030\006 \001(\t\0322\n\020EnvironmentE" +
      "ntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\277\014\n" +
      "\022AnalysisSubmission\022(\n\017app_description\030\001" +
      " \001(\tR\017app_description\022\026\n\006app_id\030\002 \001(\tR\006a" +
      "pp_id\022\032\n\010app_name\030\003 \001(\tR\010app_name\022\"\n\014arc" +
      "hive_logs\030\004 \001(\010R\014archive_logs\022\032\n\010batch_i" +
      "d\030\005 \001(\tR\010batch_id\022\034\n\tcondor_id\030\006 \001(\tR\tco" +
      "ndor_id\022(\n\017condor_log_path\030\007 \001(\tR\017condor" +
      "_log_path\0222\n\024create_output_subdir\030\010 \001(\010R" +
      "\024create_output_subdir\022B\n\016date_submitted\030" +
      "\t \001(\0132\032.google.protobuf.TimestampR\016date_" +
      "submitted\022>\n\014date_started\030\n \001(\0132\032.google" +
      ".protobuf.TimestampR\014date_started\022B\n\016dat" +
      "e_completed\030\013 \001(\0132\032.google.protobuf.Time" +
      "stampR\016date_completed\022\023\n\013description\030\014 \001" +
      "(\t\022\r\n\005email\030\r \001(\t\022\025\n\005extra\030\016 \001(\0132\006.Extra" +
      "\022*\n\020execution_target\030\017 \001(\tR\020execution_ta" +
      "rget\022\034\n\texit_code\030\020 \001(\005R\texit_code\022$\n\rfa" +
      "ilure_count\030\021 \001(\003R\rfailure_count\022,\n\021fail" +
      "ure_threshold\030\022 \001(\003R\021failure_threshold\0223" +
      "\n\rfile_metadata\030\023 \003(\0132\r.FileMetadataR\rfi" +
      "le-metadata\022\"\n\014filter_files\030\024 \003(\tR\014filte" +
      "r_files\022\r\n\005group\030\025 \001(\t\022-\n\024input_path_lis" +
      "t_file\030\026 \001(\tR\017input_path_list\022-\n\022input_t" +
      "ickets_file\030\027 \001(\tR\021input_ticket_list\022$\n\r" +
      "invocation_id\030\030 \001(\tR\rinvocation_id\022\036\n\nir" +
      "ods_base\030\031 \001(\tR\nirods_base\022\014\n\004name\030\032 \001(\t" +
      "\022\032\n\010nfs_base\030\033 \001(\tR\010nfs_base\022\016\n\006notify\030\034" +
      " \001(\010\022\032\n\010now_date\030\035 \001(\tR\010now_date\022\036\n\noutp" +
      "ut_dir\030\036 \001(\tR\noutput_dir\022,\n\021output_dir_t" +
      "icket\030\037 \001(\tR\021output_dir_ticket\022.\n\022output" +
      "_ticket_file\030  \001(\tR\022output_ticket_file\022\"" +
      "\n\014request_type\030! \001(\tR\014request_type\022\036\n\nru" +
      "n_on_nfs\030\" \001(\010R\nrun-on-nfs\022.\n\024skip_paren" +
      "t_metadata\030# \001(\010R\020skip-parent-meta\022\024\n\005st" +
      "eps\030$ \003(\0132\005.Step\022(\n\017submission_date\030% \001(" +
      "\tR\017submission_date\022\033\n\tsubmitter\030& \001(\tR\010u" +
      "sername\022\014\n\004type\030\' \001(\t\022\030\n\007user_id\030( \001(\tR\007" +
      "user_id\022 \n\013user_groups\030) \003(\tR\013user_group" +
      "s\022\034\n\tuser_home\030* \001(\tR\tuser_home\022\032\n\010wiki_" +
      "url\030+ \001(\tR\010wiki_url\022 \n\013config_file\030, \001(\t" +
      "R\013config_file\022\027\n\006header\030- \001(\0132\007.Header\"\233" +
      "\014\n\003Job\022(\n\017app_description\030\001 \001(\tR\017app_des" +
      "cription\022\026\n\006app_id\030\002 \001(\tR\006app_id\022\032\n\010app_" +
      "name\030\003 \001(\tR\010app_name\022\"\n\014archive_logs\030\004 \001" +
      "(\010R\014archive_logs\022\032\n\010batch_id\030\005 \001(\tR\010batc" +
      "h_id\022\034\n\tcondor_id\030\006 \001(\tR\tcondor_id\022(\n\017co" +
      "ndor_log_path\030\007 \001(\tR\017condor_log_path\0222\n\024" +
      "create_output_subdir\030\010 \001(\010R\024create_outpu" +
      "t_subdir\022B\n\016date_submitted\030\t \001(\0132\032.googl" +
      "e.protobuf.TimestampR\016date_submitted\022>\n\014" +
      "date_started\030\n \001(\0132\032.google.protobuf.Tim" +
      "estampR\014date_started\022B\n\016date_completed\030\013" +
      " \001(\0132\032.google.protobuf.TimestampR\016date_c" +
      "ompleted\022\023\n\013description\030\014 \001(\t\022\r\n\005email\030\r" +
      " \001(\t\022\025\n\005extra\030\016 \001(\0132\006.Extra\022*\n\020execution" +
      "_target\030\017 \001(\tR\020execution_target\022\034\n\texit_" +
      "code\030\020 \001(\005R\texit_code\022$\n\rfailure_count\030\021" +
      " \001(\003R\rfailure_count\022,\n\021failure_threshold" +
      "\030\022 \001(\003R\021failure_threshold\0223\n\rfile_metada" +
      "ta\030\023 \003(\0132\r.FileMetadataR\rfile-metadata\022\"" +
      "\n\014filter_files\030\024 \003(\tR\014filter_files\022\r\n\005gr" +
      "oup\030\025 \001(\t\022-\n\024input_path_list_file\030\026 \001(\tR" +
      "\017input_path_list\022-\n\022input_tickets_file\030\027" +
      " \001(\tR\021input_ticket_list\022$\n\rinvocation_id" +
      "\030\030 \001(\tR\rinvocation_id\022\036\n\nirods_base\030\031 \001(" +
      "\tR\nirods_base\022\014\n\004name\030\032 \001(\t\022\032\n\010nfs_base\030" +
      "\033 \001(\tR\010nfs_base\022\016\n\006notify\030\034 \001(\010\022\032\n\010now_d" +
      "ate\030\035 \001(\tR\010now_date\022\036\n\noutput_dir\030\036 \001(\tR" +
      "\noutput_dir\022,\n\021output_dir_ticket\030\037 \001(\tR\021" +
      "output_dir_ticket\022.\n\022output_ticket_file\030" +
      "  \001(\tR\022output_ticket_file\022\"\n\014request_typ" +
      "e\030! \001(\tR\014request_type\022\036\n\nrun_on_nfs\030\" \001(" +
      "\010R\nrun-on-nfs\022.\n\024skip_parent_metadata\030# " +
      "\001(\010R\020skip-parent-meta\022\024\n\005steps\030$ \003(\0132\005.S" +
      "tep\022(\n\017submission_date\030% \001(\tR\017submission" +
      "_date\022\033\n\tsubmitter\030& \001(\tR\010username\022\014\n\004ty" +
      "pe\030\' \001(\t\022\030\n\007user_id\030( \001(\tR\007user_id\022 \n\013us" +
      "er_groups\030) \003(\tR\013user_groups\022\034\n\tuser_hom" +
      "e\030* \001(\tR\tuser_home\022\032\n\010wiki_url\030+ \001(\tR\010wi" +
      "ki_url\022 \n\013config_file\030, \001(\tR\013config_file" +
      ":\002\030\001B^\n\030org.cyverse.de.protobufsB\033Analys" +
      "isSubmissionProtobufsP\001Z#github.com/cyve" +
      "rse-de/p/go/analysisb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          org.cyverse.de.protobufs.AnalysisContainerProtobufs.getDescriptor(),
          org.cyverse.de.protobufs.HeaderProtobufs.getDescriptor(),
        });
    internal_static_HTCondorExtraInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HTCondorExtraInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HTCondorExtraInfo_descriptor,
        new java.lang.String[] { "ExtraRequirements", });
    internal_static_Extra_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Extra_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Extra_descriptor,
        new java.lang.String[] { "HtCondor", });
    internal_static_FileMetadata_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_FileMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FileMetadata_descriptor,
        new java.lang.String[] { "Attribute", "Value", "Unit", });
    internal_static_Step_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Step_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Step_descriptor,
        new java.lang.String[] { "Component", "Config", "Type", "StdinPath", "StdoutPath", "StderrPath", "LogFile", "Environment", "Input", "Output", "Header", });
    internal_static_Step_Component_descriptor =
      internal_static_Step_descriptor.getNestedTypes().get(0);
    internal_static_Step_Component_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Step_Component_descriptor,
        new java.lang.String[] { "Container", "Type", "Name", "Location", "Description", "TimeLimit", "Restricted", "IsInteractive", });
    internal_static_Step_Param_descriptor =
      internal_static_Step_descriptor.getNestedTypes().get(1);
    internal_static_Step_Param_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Step_Param_descriptor,
        new java.lang.String[] { "Id", "Name", "Value", "Order", "Type", "Path", });
    internal_static_Step_Config_descriptor =
      internal_static_Step_descriptor.getNestedTypes().get(2);
    internal_static_Step_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Step_Config_descriptor,
        new java.lang.String[] { "Params", "Inputs", "Outputs", });
    internal_static_Step_Input_descriptor =
      internal_static_Step_descriptor.getNestedTypes().get(3);
    internal_static_Step_Input_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Step_Input_descriptor,
        new java.lang.String[] { "Id", "Ticket", "Multiplicity", "Name", "Property", "Retain", "Type", "Value", });
    internal_static_Step_Output_descriptor =
      internal_static_Step_descriptor.getNestedTypes().get(4);
    internal_static_Step_Output_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Step_Output_descriptor,
        new java.lang.String[] { "Multiplicity", "Name", "Property", "QualId", "Retain", "Type", });
    internal_static_Step_EnvironmentEntry_descriptor =
      internal_static_Step_descriptor.getNestedTypes().get(5);
    internal_static_Step_EnvironmentEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Step_EnvironmentEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_AnalysisSubmission_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_AnalysisSubmission_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AnalysisSubmission_descriptor,
        new java.lang.String[] { "AppDescription", "AppId", "AppName", "ArchiveLogs", "BatchId", "CondorId", "CondorLogPath", "CreateOutputSubdir", "DateSubmitted", "DateStarted", "DateCompleted", "Description", "Email", "Extra", "ExecutionTarget", "ExitCode", "FailureCount", "FailureThreshold", "FileMetadata", "FilterFiles", "Group", "InputPathListFile", "InputTicketsFile", "InvocationId", "IrodsBase", "Name", "NfsBase", "Notify", "NowDate", "OutputDir", "OutputDirTicket", "OutputTicketFile", "RequestType", "RunOnNfs", "SkipParentMetadata", "Steps", "SubmissionDate", "Submitter", "Type", "UserId", "UserGroups", "UserHome", "WikiUrl", "ConfigFile", "Header", });
    internal_static_Job_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Job_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Job_descriptor,
        new java.lang.String[] { "AppDescription", "AppId", "AppName", "ArchiveLogs", "BatchId", "CondorId", "CondorLogPath", "CreateOutputSubdir", "DateSubmitted", "DateStarted", "DateCompleted", "Description", "Email", "Extra", "ExecutionTarget", "ExitCode", "FailureCount", "FailureThreshold", "FileMetadata", "FilterFiles", "Group", "InputPathListFile", "InputTicketsFile", "InvocationId", "IrodsBase", "Name", "NfsBase", "Notify", "NowDate", "OutputDir", "OutputDirTicket", "OutputTicketFile", "RequestType", "RunOnNfs", "SkipParentMetadata", "Steps", "SubmissionDate", "Submitter", "Type", "UserId", "UserGroups", "UserHome", "WikiUrl", "ConfigFile", });
    com.google.protobuf.TimestampProto.getDescriptor();
    org.cyverse.de.protobufs.AnalysisContainerProtobufs.getDescriptor();
    org.cyverse.de.protobufs.HeaderProtobufs.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
