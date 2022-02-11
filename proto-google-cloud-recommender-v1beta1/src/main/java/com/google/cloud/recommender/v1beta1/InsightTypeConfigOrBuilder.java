/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommender/v1beta1/insight_type_config.proto

package com.google.cloud.recommender.v1beta1;

public interface InsightTypeConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommender.v1beta1.InsightTypeConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of insight type config.
   * Eg,
   * projects/[PROJECT_NUMBER]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]/config
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of insight type config.
   * Eg,
   * projects/[PROJECT_NUMBER]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]/config
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * InsightTypeGenerationConfig which configures the generation of
   * insights for this insight type.
   * </pre>
   *
   * <code>
   * .google.cloud.recommender.v1beta1.InsightTypeGenerationConfig insight_type_generation_config = 2;
   * </code>
   *
   * @return Whether the insightTypeGenerationConfig field is set.
   */
  boolean hasInsightTypeGenerationConfig();
  /**
   *
   *
   * <pre>
   * InsightTypeGenerationConfig which configures the generation of
   * insights for this insight type.
   * </pre>
   *
   * <code>
   * .google.cloud.recommender.v1beta1.InsightTypeGenerationConfig insight_type_generation_config = 2;
   * </code>
   *
   * @return The insightTypeGenerationConfig.
   */
  com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfig getInsightTypeGenerationConfig();
  /**
   *
   *
   * <pre>
   * InsightTypeGenerationConfig which configures the generation of
   * insights for this insight type.
   * </pre>
   *
   * <code>
   * .google.cloud.recommender.v1beta1.InsightTypeGenerationConfig insight_type_generation_config = 2;
   * </code>
   */
  com.google.cloud.recommender.v1beta1.InsightTypeGenerationConfigOrBuilder
      getInsightTypeGenerationConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Fingerprint of the InsightTypeConfig. Provides optimistic locking when
   * updating.
   * </pre>
   *
   * <code>string etag = 3;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Fingerprint of the InsightTypeConfig. Provides optimistic locking when
   * updating.
   * </pre>
   *
   * <code>string etag = 3;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Last time when the config was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Last time when the config was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Last time when the config was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Immutable. The revision ID of the config.
   * A new revision is committed whenever the config is changed in any way.
   * The format is an 8-character hexadecimal string.
   * </pre>
   *
   * <code>
   * string revision_id = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The revisionId.
   */
  java.lang.String getRevisionId();
  /**
   *
   *
   * <pre>
   * Output only. Immutable. The revision ID of the config.
   * A new revision is committed whenever the config is changed in any way.
   * The format is an 8-character hexadecimal string.
   * </pre>
   *
   * <code>
   * string revision_id = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for revisionId.
   */
  com.google.protobuf.ByteString getRevisionIdBytes();

  /**
   *
   *
   * <pre>
   * Allows clients to store small amounts of arbitrary data. Annotations must
   * follow the Kubernetes syntax.
   * The total size of all keys and values combined is limited to 256k.
   * Key can have 2 segments: prefix (optional) and name (required),
   * separated by a slash (/).
   * Prefix must be a DNS subdomain.
   * Name must be 63 characters or less, begin and end with alphanumerics,
   * with dashes (-), underscores (_), dots (.), and alphanumerics between.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 6;</code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Allows clients to store small amounts of arbitrary data. Annotations must
   * follow the Kubernetes syntax.
   * The total size of all keys and values combined is limited to 256k.
   * Key can have 2 segments: prefix (optional) and name (required),
   * separated by a slash (/).
   * Prefix must be a DNS subdomain.
   * Name must be 63 characters or less, begin and end with alphanumerics,
   * with dashes (-), underscores (_), dots (.), and alphanumerics between.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 6;</code>
   */
  boolean containsAnnotations(java.lang.String key);
  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();
  /**
   *
   *
   * <pre>
   * Allows clients to store small amounts of arbitrary data. Annotations must
   * follow the Kubernetes syntax.
   * The total size of all keys and values combined is limited to 256k.
   * Key can have 2 segments: prefix (optional) and name (required),
   * separated by a slash (/).
   * Prefix must be a DNS subdomain.
   * Name must be 63 characters or less, begin and end with alphanumerics,
   * with dashes (-), underscores (_), dots (.), and alphanumerics between.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
  /**
   *
   *
   * <pre>
   * Allows clients to store small amounts of arbitrary data. Annotations must
   * follow the Kubernetes syntax.
   * The total size of all keys and values combined is limited to 256k.
   * Key can have 2 segments: prefix (optional) and name (required),
   * separated by a slash (/).
   * Prefix must be a DNS subdomain.
   * Name must be 63 characters or less, begin and end with alphanumerics,
   * with dashes (-), underscores (_), dots (.), and alphanumerics between.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 6;</code>
   */
  java.lang.String getAnnotationsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Allows clients to store small amounts of arbitrary data. Annotations must
   * follow the Kubernetes syntax.
   * The total size of all keys and values combined is limited to 256k.
   * Key can have 2 segments: prefix (optional) and name (required),
   * separated by a slash (/).
   * Prefix must be a DNS subdomain.
   * Name must be 63 characters or less, begin and end with alphanumerics,
   * with dashes (-), underscores (_), dots (.), and alphanumerics between.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 6;</code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * A user-settable field to provide a human-readable name to be used in user
   * interfaces.
   * </pre>
   *
   * <code>string display_name = 7;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * A user-settable field to provide a human-readable name to be used in user
   * interfaces.
   * </pre>
   *
   * <code>string display_name = 7;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();
}
