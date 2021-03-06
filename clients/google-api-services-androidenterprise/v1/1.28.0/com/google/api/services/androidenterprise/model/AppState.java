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

package com.google.api.services.androidenterprise.model;

/**
 * List of states set by the app.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppState extends com.google.api.client.json.GenericJson {

  /**
   * List of keyed app states. This field will always be present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<KeyedAppState> keyedAppState;

  /**
   * The package name of the app. This field will always be present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String packageName;

  /**
   * List of keyed app states. This field will always be present.
   * @return value or {@code null} for none
   */
  public java.util.List<KeyedAppState> getKeyedAppState() {
    return keyedAppState;
  }

  /**
   * List of keyed app states. This field will always be present.
   * @param keyedAppState keyedAppState or {@code null} for none
   */
  public AppState setKeyedAppState(java.util.List<KeyedAppState> keyedAppState) {
    this.keyedAppState = keyedAppState;
    return this;
  }

  /**
   * The package name of the app. This field will always be present.
   * @return value or {@code null} for none
   */
  public java.lang.String getPackageName() {
    return packageName;
  }

  /**
   * The package name of the app. This field will always be present.
   * @param packageName packageName or {@code null} for none
   */
  public AppState setPackageName(java.lang.String packageName) {
    this.packageName = packageName;
    return this;
  }

  @Override
  public AppState set(String fieldName, Object value) {
    return (AppState) super.set(fieldName, value);
  }

  @Override
  public AppState clone() {
    return (AppState) super.clone();
  }

}
