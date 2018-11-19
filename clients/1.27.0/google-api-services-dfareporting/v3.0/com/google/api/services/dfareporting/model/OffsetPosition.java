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

package com.google.api.services.dfareporting.model;

/**
 * Offset Position.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OffsetPosition extends com.google.api.client.json.GenericJson {

  /**
   * Offset distance from left side of an asset or a window.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer left;

  /**
   * Offset distance from top side of an asset or a window.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer top;

  /**
   * Offset distance from left side of an asset or a window.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLeft() {
    return left;
  }

  /**
   * Offset distance from left side of an asset or a window.
   * @param left left or {@code null} for none
   */
  public OffsetPosition setLeft(java.lang.Integer left) {
    this.left = left;
    return this;
  }

  /**
   * Offset distance from top side of an asset or a window.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTop() {
    return top;
  }

  /**
   * Offset distance from top side of an asset or a window.
   * @param top top or {@code null} for none
   */
  public OffsetPosition setTop(java.lang.Integer top) {
    this.top = top;
    return this;
  }

  @Override
  public OffsetPosition set(String fieldName, Object value) {
    return (OffsetPosition) super.set(fieldName, value);
  }

  @Override
  public OffsetPosition clone() {
    return (OffsetPosition) super.clone();
  }

}