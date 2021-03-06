/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.container.v1beta1.model;

/**
 * Configuration for exporting cluster resource usages.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResourceUsageExportConfig extends com.google.api.client.json.GenericJson {

  /**
   * Configuration to use BigQuery as usage export destination.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BigQueryDestination bigqueryDestination;

  /**
   * Configuration to enable resource consumption metering.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConsumptionMeteringConfig consumptionMeteringConfig;

  /**
   * Whether to enable network egress metering for this cluster. If enabled, a daemonset will be
   * created in the cluster to meter network egress traffic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableNetworkEgressMetering;

  /**
   * Configuration to use BigQuery as usage export destination.
   * @return value or {@code null} for none
   */
  public BigQueryDestination getBigqueryDestination() {
    return bigqueryDestination;
  }

  /**
   * Configuration to use BigQuery as usage export destination.
   * @param bigqueryDestination bigqueryDestination or {@code null} for none
   */
  public ResourceUsageExportConfig setBigqueryDestination(BigQueryDestination bigqueryDestination) {
    this.bigqueryDestination = bigqueryDestination;
    return this;
  }

  /**
   * Configuration to enable resource consumption metering.
   * @return value or {@code null} for none
   */
  public ConsumptionMeteringConfig getConsumptionMeteringConfig() {
    return consumptionMeteringConfig;
  }

  /**
   * Configuration to enable resource consumption metering.
   * @param consumptionMeteringConfig consumptionMeteringConfig or {@code null} for none
   */
  public ResourceUsageExportConfig setConsumptionMeteringConfig(ConsumptionMeteringConfig consumptionMeteringConfig) {
    this.consumptionMeteringConfig = consumptionMeteringConfig;
    return this;
  }

  /**
   * Whether to enable network egress metering for this cluster. If enabled, a daemonset will be
   * created in the cluster to meter network egress traffic.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableNetworkEgressMetering() {
    return enableNetworkEgressMetering;
  }

  /**
   * Whether to enable network egress metering for this cluster. If enabled, a daemonset will be
   * created in the cluster to meter network egress traffic.
   * @param enableNetworkEgressMetering enableNetworkEgressMetering or {@code null} for none
   */
  public ResourceUsageExportConfig setEnableNetworkEgressMetering(java.lang.Boolean enableNetworkEgressMetering) {
    this.enableNetworkEgressMetering = enableNetworkEgressMetering;
    return this;
  }

  @Override
  public ResourceUsageExportConfig set(String fieldName, Object value) {
    return (ResourceUsageExportConfig) super.set(fieldName, value);
  }

  @Override
  public ResourceUsageExportConfig clone() {
    return (ResourceUsageExportConfig) super.clone();
  }

}
