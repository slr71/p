// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: analysis_submission.proto

package org.cyverse.de.protobufs;

public interface AnalysisSubmissionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AnalysisSubmission)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string app_description = 1 [json_name = "app_description"];</code>
   * @return The appDescription.
   */
  java.lang.String getAppDescription();
  /**
   * <code>string app_description = 1 [json_name = "app_description"];</code>
   * @return The bytes for appDescription.
   */
  com.google.protobuf.ByteString
      getAppDescriptionBytes();

  /**
   * <code>string app_id = 2 [json_name = "app_id"];</code>
   * @return The appId.
   */
  java.lang.String getAppId();
  /**
   * <code>string app_id = 2 [json_name = "app_id"];</code>
   * @return The bytes for appId.
   */
  com.google.protobuf.ByteString
      getAppIdBytes();

  /**
   * <code>string app_name = 3 [json_name = "app_name"];</code>
   * @return The appName.
   */
  java.lang.String getAppName();
  /**
   * <code>string app_name = 3 [json_name = "app_name"];</code>
   * @return The bytes for appName.
   */
  com.google.protobuf.ByteString
      getAppNameBytes();

  /**
   * <code>bool archive_logs = 4 [json_name = "archive_logs"];</code>
   * @return The archiveLogs.
   */
  boolean getArchiveLogs();

  /**
   * <code>string batch_id = 5 [json_name = "batch_id"];</code>
   * @return The batchId.
   */
  java.lang.String getBatchId();
  /**
   * <code>string batch_id = 5 [json_name = "batch_id"];</code>
   * @return The bytes for batchId.
   */
  com.google.protobuf.ByteString
      getBatchIdBytes();

  /**
   * <code>string condor_id = 6 [json_name = "condor_id"];</code>
   * @return The condorId.
   */
  java.lang.String getCondorId();
  /**
   * <code>string condor_id = 6 [json_name = "condor_id"];</code>
   * @return The bytes for condorId.
   */
  com.google.protobuf.ByteString
      getCondorIdBytes();

  /**
   * <code>string condor_log_path = 7 [json_name = "condor_log_path"];</code>
   * @return The condorLogPath.
   */
  java.lang.String getCondorLogPath();
  /**
   * <code>string condor_log_path = 7 [json_name = "condor_log_path"];</code>
   * @return The bytes for condorLogPath.
   */
  com.google.protobuf.ByteString
      getCondorLogPathBytes();

  /**
   * <code>bool create_output_subdir = 8 [json_name = "create_output_subdir"];</code>
   * @return The createOutputSubdir.
   */
  boolean getCreateOutputSubdir();

  /**
   * <code>.google.protobuf.Timestamp date_submitted = 9 [json_name = "date_submitted"];</code>
   * @return Whether the dateSubmitted field is set.
   */
  boolean hasDateSubmitted();
  /**
   * <code>.google.protobuf.Timestamp date_submitted = 9 [json_name = "date_submitted"];</code>
   * @return The dateSubmitted.
   */
  com.google.protobuf.Timestamp getDateSubmitted();
  /**
   * <code>.google.protobuf.Timestamp date_submitted = 9 [json_name = "date_submitted"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateSubmittedOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp date_started = 10 [json_name = "date_started"];</code>
   * @return Whether the dateStarted field is set.
   */
  boolean hasDateStarted();
  /**
   * <code>.google.protobuf.Timestamp date_started = 10 [json_name = "date_started"];</code>
   * @return The dateStarted.
   */
  com.google.protobuf.Timestamp getDateStarted();
  /**
   * <code>.google.protobuf.Timestamp date_started = 10 [json_name = "date_started"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateStartedOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp date_completed = 11 [json_name = "date_completed"];</code>
   * @return Whether the dateCompleted field is set.
   */
  boolean hasDateCompleted();
  /**
   * <code>.google.protobuf.Timestamp date_completed = 11 [json_name = "date_completed"];</code>
   * @return The dateCompleted.
   */
  com.google.protobuf.Timestamp getDateCompleted();
  /**
   * <code>.google.protobuf.Timestamp date_completed = 11 [json_name = "date_completed"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateCompletedOrBuilder();

  /**
   * <code>string description = 12;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 12;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string email = 13;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 13;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <pre>
   * read all about it
   * </pre>
   *
   * <code>.Extra extra = 14;</code>
   * @return Whether the extra field is set.
   */
  boolean hasExtra();
  /**
   * <pre>
   * read all about it
   * </pre>
   *
   * <code>.Extra extra = 14;</code>
   * @return The extra.
   */
  org.cyverse.de.protobufs.Extra getExtra();
  /**
   * <pre>
   * read all about it
   * </pre>
   *
   * <code>.Extra extra = 14;</code>
   */
  org.cyverse.de.protobufs.ExtraOrBuilder getExtraOrBuilder();

  /**
   * <code>string execution_target = 15 [json_name = "execution_target"];</code>
   * @return The executionTarget.
   */
  java.lang.String getExecutionTarget();
  /**
   * <code>string execution_target = 15 [json_name = "execution_target"];</code>
   * @return The bytes for executionTarget.
   */
  com.google.protobuf.ByteString
      getExecutionTargetBytes();

  /**
   * <code>int32 exit_code = 16 [json_name = "exit_code"];</code>
   * @return The exitCode.
   */
  int getExitCode();

  /**
   * <code>int64 failure_count = 17 [json_name = "failure_count"];</code>
   * @return The failureCount.
   */
  long getFailureCount();

  /**
   * <code>int64 failure_threshold = 18 [json_name = "failure_threshold"];</code>
   * @return The failureThreshold.
   */
  long getFailureThreshold();

  /**
   * <pre>
   * The - is used instead of _ for backwards compatibility.
   * </pre>
   *
   * <code>repeated .FileMetadata file_metadata = 19 [json_name = "file-metadata"];</code>
   */
  java.util.List<org.cyverse.de.protobufs.FileMetadata> 
      getFileMetadataList();
  /**
   * <pre>
   * The - is used instead of _ for backwards compatibility.
   * </pre>
   *
   * <code>repeated .FileMetadata file_metadata = 19 [json_name = "file-metadata"];</code>
   */
  org.cyverse.de.protobufs.FileMetadata getFileMetadata(int index);
  /**
   * <pre>
   * The - is used instead of _ for backwards compatibility.
   * </pre>
   *
   * <code>repeated .FileMetadata file_metadata = 19 [json_name = "file-metadata"];</code>
   */
  int getFileMetadataCount();
  /**
   * <pre>
   * The - is used instead of _ for backwards compatibility.
   * </pre>
   *
   * <code>repeated .FileMetadata file_metadata = 19 [json_name = "file-metadata"];</code>
   */
  java.util.List<? extends org.cyverse.de.protobufs.FileMetadataOrBuilder> 
      getFileMetadataOrBuilderList();
  /**
   * <pre>
   * The - is used instead of _ for backwards compatibility.
   * </pre>
   *
   * <code>repeated .FileMetadata file_metadata = 19 [json_name = "file-metadata"];</code>
   */
  org.cyverse.de.protobufs.FileMetadataOrBuilder getFileMetadataOrBuilder(
      int index);

  /**
   * <code>repeated string filter_files = 20 [json_name = "filter_files"];</code>
   * @return A list containing the filterFiles.
   */
  java.util.List<java.lang.String>
      getFilterFilesList();
  /**
   * <code>repeated string filter_files = 20 [json_name = "filter_files"];</code>
   * @return The count of filterFiles.
   */
  int getFilterFilesCount();
  /**
   * <code>repeated string filter_files = 20 [json_name = "filter_files"];</code>
   * @param index The index of the element to return.
   * @return The filterFiles at the given index.
   */
  java.lang.String getFilterFiles(int index);
  /**
   * <code>repeated string filter_files = 20 [json_name = "filter_files"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the filterFiles at the given index.
   */
  com.google.protobuf.ByteString
      getFilterFilesBytes(int index);

  /**
   * <code>string group = 21;</code>
   * @return The group.
   */
  java.lang.String getGroup();
  /**
   * <code>string group = 21;</code>
   * @return The bytes for group.
   */
  com.google.protobuf.ByteString
      getGroupBytes();

  /**
   * <code>string input_path_list_file = 22 [json_name = "input_path_list"];</code>
   * @return The inputPathListFile.
   */
  java.lang.String getInputPathListFile();
  /**
   * <code>string input_path_list_file = 22 [json_name = "input_path_list"];</code>
   * @return The bytes for inputPathListFile.
   */
  com.google.protobuf.ByteString
      getInputPathListFileBytes();

  /**
   * <code>string input_tickets_file = 23 [json_name = "input_ticket_list"];</code>
   * @return The inputTicketsFile.
   */
  java.lang.String getInputTicketsFile();
  /**
   * <code>string input_tickets_file = 23 [json_name = "input_ticket_list"];</code>
   * @return The bytes for inputTicketsFile.
   */
  com.google.protobuf.ByteString
      getInputTicketsFileBytes();

  /**
   * <pre>
   * AKA the external ID.
   * </pre>
   *
   * <code>string invocation_id = 24 [json_name = "invocation_id"];</code>
   * @return The invocationId.
   */
  java.lang.String getInvocationId();
  /**
   * <pre>
   * AKA the external ID.
   * </pre>
   *
   * <code>string invocation_id = 24 [json_name = "invocation_id"];</code>
   * @return The bytes for invocationId.
   */
  com.google.protobuf.ByteString
      getInvocationIdBytes();

  /**
   * <code>string irods_base = 25 [json_name = "irods_base"];</code>
   * @return The irodsBase.
   */
  java.lang.String getIrodsBase();
  /**
   * <code>string irods_base = 25 [json_name = "irods_base"];</code>
   * @return The bytes for irodsBase.
   */
  com.google.protobuf.ByteString
      getIrodsBaseBytes();

  /**
   * <code>string name = 26;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 26;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string nfs_base = 27 [json_name = "nfs_base"];</code>
   * @return The nfsBase.
   */
  java.lang.String getNfsBase();
  /**
   * <code>string nfs_base = 27 [json_name = "nfs_base"];</code>
   * @return The bytes for nfsBase.
   */
  com.google.protobuf.ByteString
      getNfsBaseBytes();

  /**
   * <code>bool notify = 28;</code>
   * @return The notify.
   */
  boolean getNotify();

  /**
   * <code>string now_date = 29 [json_name = "now_date"];</code>
   * @return The nowDate.
   */
  java.lang.String getNowDate();
  /**
   * <code>string now_date = 29 [json_name = "now_date"];</code>
   * @return The bytes for nowDate.
   */
  com.google.protobuf.ByteString
      getNowDateBytes();

  /**
   * <code>string output_dir = 30 [json_name = "output_dir"];</code>
   * @return The outputDir.
   */
  java.lang.String getOutputDir();
  /**
   * <code>string output_dir = 30 [json_name = "output_dir"];</code>
   * @return The bytes for outputDir.
   */
  com.google.protobuf.ByteString
      getOutputDirBytes();

  /**
   * <code>string output_dir_ticket = 31 [json_name = "output_dir_ticket"];</code>
   * @return The outputDirTicket.
   */
  java.lang.String getOutputDirTicket();
  /**
   * <code>string output_dir_ticket = 31 [json_name = "output_dir_ticket"];</code>
   * @return The bytes for outputDirTicket.
   */
  com.google.protobuf.ByteString
      getOutputDirTicketBytes();

  /**
   * <code>string output_ticket_file = 32 [json_name = "output_ticket_file"];</code>
   * @return The outputTicketFile.
   */
  java.lang.String getOutputTicketFile();
  /**
   * <code>string output_ticket_file = 32 [json_name = "output_ticket_file"];</code>
   * @return The bytes for outputTicketFile.
   */
  com.google.protobuf.ByteString
      getOutputTicketFileBytes();

  /**
   * <code>string request_type = 33 [json_name = "request_type"];</code>
   * @return The requestType.
   */
  java.lang.String getRequestType();
  /**
   * <code>string request_type = 33 [json_name = "request_type"];</code>
   * @return The bytes for requestType.
   */
  com.google.protobuf.ByteString
      getRequestTypeBytes();

  /**
   * <pre>
   * The - is on purpose.
   * </pre>
   *
   * <code>bool run_on_nfs = 34 [json_name = "run-on-nfs"];</code>
   * @return The runOnNfs.
   */
  boolean getRunOnNfs();

  /**
   * <pre>
   * The - is on purpose. 
   * </pre>
   *
   * <code>bool skip_parent_metadata = 35 [json_name = "skip-parent-meta"];</code>
   * @return The skipParentMetadata.
   */
  boolean getSkipParentMetadata();

  /**
   * <code>repeated .Step steps = 36;</code>
   */
  java.util.List<org.cyverse.de.protobufs.Step> 
      getStepsList();
  /**
   * <code>repeated .Step steps = 36;</code>
   */
  org.cyverse.de.protobufs.Step getSteps(int index);
  /**
   * <code>repeated .Step steps = 36;</code>
   */
  int getStepsCount();
  /**
   * <code>repeated .Step steps = 36;</code>
   */
  java.util.List<? extends org.cyverse.de.protobufs.StepOrBuilder> 
      getStepsOrBuilderList();
  /**
   * <code>repeated .Step steps = 36;</code>
   */
  org.cyverse.de.protobufs.StepOrBuilder getStepsOrBuilder(
      int index);

  /**
   * <code>string submission_date = 37 [json_name = "submission_date"];</code>
   * @return The submissionDate.
   */
  java.lang.String getSubmissionDate();
  /**
   * <code>string submission_date = 37 [json_name = "submission_date"];</code>
   * @return The bytes for submissionDate.
   */
  com.google.protobuf.ByteString
      getSubmissionDateBytes();

  /**
   * <pre>
   * Yup, the JSON name is completely different from the field name.
   * </pre>
   *
   * <code>string submitter = 38 [json_name = "username"];</code>
   * @return The submitter.
   */
  java.lang.String getSubmitter();
  /**
   * <pre>
   * Yup, the JSON name is completely different from the field name.
   * </pre>
   *
   * <code>string submitter = 38 [json_name = "username"];</code>
   * @return The bytes for submitter.
   */
  com.google.protobuf.ByteString
      getSubmitterBytes();

  /**
   * <code>string type = 39;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 39;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>string user_id = 40 [json_name = "user_id"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 40 [json_name = "user_id"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>repeated string user_groups = 41 [json_name = "user_groups"];</code>
   * @return A list containing the userGroups.
   */
  java.util.List<java.lang.String>
      getUserGroupsList();
  /**
   * <code>repeated string user_groups = 41 [json_name = "user_groups"];</code>
   * @return The count of userGroups.
   */
  int getUserGroupsCount();
  /**
   * <code>repeated string user_groups = 41 [json_name = "user_groups"];</code>
   * @param index The index of the element to return.
   * @return The userGroups at the given index.
   */
  java.lang.String getUserGroups(int index);
  /**
   * <code>repeated string user_groups = 41 [json_name = "user_groups"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the userGroups at the given index.
   */
  com.google.protobuf.ByteString
      getUserGroupsBytes(int index);

  /**
   * <code>string user_home = 42 [json_name = "user_home"];</code>
   * @return The userHome.
   */
  java.lang.String getUserHome();
  /**
   * <code>string user_home = 42 [json_name = "user_home"];</code>
   * @return The bytes for userHome.
   */
  com.google.protobuf.ByteString
      getUserHomeBytes();

  /**
   * <code>string wiki_url = 43 [json_name = "wiki_url"];</code>
   * @return The wikiUrl.
   */
  java.lang.String getWikiUrl();
  /**
   * <code>string wiki_url = 43 [json_name = "wiki_url"];</code>
   * @return The bytes for wikiUrl.
   */
  com.google.protobuf.ByteString
      getWikiUrlBytes();

  /**
   * <code>string config_file = 44 [json_name = "config_file"];</code>
   * @return The configFile.
   */
  java.lang.String getConfigFile();
  /**
   * <code>string config_file = 44 [json_name = "config_file"];</code>
   * @return The bytes for configFile.
   */
  com.google.protobuf.ByteString
      getConfigFileBytes();

  /**
   * <code>.Header header = 45;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <code>.Header header = 45;</code>
   * @return The header.
   */
  org.cyverse.de.protobufs.Header getHeader();
  /**
   * <code>.Header header = 45;</code>
   */
  org.cyverse.de.protobufs.HeaderOrBuilder getHeaderOrBuilder();
}
