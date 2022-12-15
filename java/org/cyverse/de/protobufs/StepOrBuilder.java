// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: analysis_submission.proto

package org.cyverse.de.protobufs;

public interface StepOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Step)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Step.Component component = 1;</code>
   * @return Whether the component field is set.
   */
  boolean hasComponent();
  /**
   * <code>.Step.Component component = 1;</code>
   * @return The component.
   */
  org.cyverse.de.protobufs.Step.Component getComponent();
  /**
   * <code>.Step.Component component = 1;</code>
   */
  org.cyverse.de.protobufs.Step.ComponentOrBuilder getComponentOrBuilder();

  /**
   * <code>.Step.Config config = 2;</code>
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   * <code>.Step.Config config = 2;</code>
   * @return The config.
   */
  org.cyverse.de.protobufs.Step.Config getConfig();
  /**
   * <code>.Step.Config config = 2;</code>
   */
  org.cyverse.de.protobufs.Step.ConfigOrBuilder getConfigOrBuilder();

  /**
   * <code>string type = 3;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 3;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>string stdin_path = 4 [json_name = "stdin"];</code>
   * @return The stdinPath.
   */
  java.lang.String getStdinPath();
  /**
   * <code>string stdin_path = 4 [json_name = "stdin"];</code>
   * @return The bytes for stdinPath.
   */
  com.google.protobuf.ByteString
      getStdinPathBytes();

  /**
   * <code>string stdout_path = 5 [json_name = "stdout"];</code>
   * @return The stdoutPath.
   */
  java.lang.String getStdoutPath();
  /**
   * <code>string stdout_path = 5 [json_name = "stdout"];</code>
   * @return The bytes for stdoutPath.
   */
  com.google.protobuf.ByteString
      getStdoutPathBytes();

  /**
   * <code>string stderr_path = 6 [json_name = "stderr"];</code>
   * @return The stderrPath.
   */
  java.lang.String getStderrPath();
  /**
   * <code>string stderr_path = 6 [json_name = "stderr"];</code>
   * @return The bytes for stderrPath.
   */
  com.google.protobuf.ByteString
      getStderrPathBytes();

  /**
   * <code>string log_file = 7 [json_name = "log-file"];</code>
   * @return The logFile.
   */
  java.lang.String getLogFile();
  /**
   * <code>string log_file = 7 [json_name = "log-file"];</code>
   * @return The bytes for logFile.
   */
  com.google.protobuf.ByteString
      getLogFileBytes();

  /**
   * <code>map&lt;string, string&gt; environment = 8;</code>
   */
  int getEnvironmentCount();
  /**
   * <code>map&lt;string, string&gt; environment = 8;</code>
   */
  boolean containsEnvironment(
      java.lang.String key);
  /**
   * Use {@link #getEnvironmentMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getEnvironment();
  /**
   * <code>map&lt;string, string&gt; environment = 8;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getEnvironmentMap();
  /**
   * <code>map&lt;string, string&gt; environment = 8;</code>
   */
  /* nullable */
java.lang.String getEnvironmentOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; environment = 8;</code>
   */
  java.lang.String getEnvironmentOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * It's really annoying, but this is singular for backwards compatibility.
   * </pre>
   *
   * <code>repeated .Step.Input input = 9;</code>
   */
  java.util.List<org.cyverse.de.protobufs.Step.Input> 
      getInputList();
  /**
   * <pre>
   * It's really annoying, but this is singular for backwards compatibility.
   * </pre>
   *
   * <code>repeated .Step.Input input = 9;</code>
   */
  org.cyverse.de.protobufs.Step.Input getInput(int index);
  /**
   * <pre>
   * It's really annoying, but this is singular for backwards compatibility.
   * </pre>
   *
   * <code>repeated .Step.Input input = 9;</code>
   */
  int getInputCount();
  /**
   * <pre>
   * It's really annoying, but this is singular for backwards compatibility.
   * </pre>
   *
   * <code>repeated .Step.Input input = 9;</code>
   */
  java.util.List<? extends org.cyverse.de.protobufs.Step.InputOrBuilder> 
      getInputOrBuilderList();
  /**
   * <pre>
   * It's really annoying, but this is singular for backwards compatibility.
   * </pre>
   *
   * <code>repeated .Step.Input input = 9;</code>
   */
  org.cyverse.de.protobufs.Step.InputOrBuilder getInputOrBuilder(
      int index);

  /**
   * <pre>
   * It's really annoying, but this is singular for backwards compatibility.
   * </pre>
   *
   * <code>repeated .Step.Output output = 10;</code>
   */
  java.util.List<org.cyverse.de.protobufs.Step.Output> 
      getOutputList();
  /**
   * <pre>
   * It's really annoying, but this is singular for backwards compatibility.
   * </pre>
   *
   * <code>repeated .Step.Output output = 10;</code>
   */
  org.cyverse.de.protobufs.Step.Output getOutput(int index);
  /**
   * <pre>
   * It's really annoying, but this is singular for backwards compatibility.
   * </pre>
   *
   * <code>repeated .Step.Output output = 10;</code>
   */
  int getOutputCount();
  /**
   * <pre>
   * It's really annoying, but this is singular for backwards compatibility.
   * </pre>
   *
   * <code>repeated .Step.Output output = 10;</code>
   */
  java.util.List<? extends org.cyverse.de.protobufs.Step.OutputOrBuilder> 
      getOutputOrBuilderList();
  /**
   * <pre>
   * It's really annoying, but this is singular for backwards compatibility.
   * </pre>
   *
   * <code>repeated .Step.Output output = 10;</code>
   */
  org.cyverse.de.protobufs.Step.OutputOrBuilder getOutputOrBuilder(
      int index);

  /**
   * <code>.Header header = 11;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <code>.Header header = 11;</code>
   * @return The header.
   */
  org.cyverse.de.protobufs.Header getHeader();
  /**
   * <code>.Header header = 11;</code>
   */
  org.cyverse.de.protobufs.HeaderOrBuilder getHeaderOrBuilder();
}
