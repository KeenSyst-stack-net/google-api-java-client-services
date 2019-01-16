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

package com.google.api.services.dataflow.model;

/**
 * A representation of a floating point mean metric contribution.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FloatingPointMean extends com.google.api.client.json.GenericJson {

  /**
   * The number of values being aggregated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SplitInt64 count;

  /**
   * The sum of all values being aggregated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double sum;

  /**
   * The number of values being aggregated.
   * @return value or {@code null} for none
   */
  public SplitInt64 getCount() {
    return count;
  }

  /**
   * The number of values being aggregated.
   * @param count count or {@code null} for none
   */
  public FloatingPointMean setCount(SplitInt64 count) {
    this.count = count;
    return this;
  }

  /**
   * The sum of all values being aggregated.
   * @return value or {@code null} for none
   */
  public java.lang.Double getSum() {
    return sum;
  }

  /**
   * The sum of all values being aggregated.
   * @param sum sum or {@code null} for none
   */
  public FloatingPointMean setSum(java.lang.Double sum) {
    this.sum = sum;
    return this;
  }

  @Override
  public FloatingPointMean set(String fieldName, Object value) {
    return (FloatingPointMean) super.set(fieldName, value);
  }

  @Override
  public FloatingPointMean clone() {
    return (FloatingPointMean) super.clone();
  }

}