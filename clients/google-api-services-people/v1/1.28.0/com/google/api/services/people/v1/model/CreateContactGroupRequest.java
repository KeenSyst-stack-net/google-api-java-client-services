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

package com.google.api.services.people.v1.model;

/**
 * A request to create a new contact group.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateContactGroupRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The contact group to create.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ContactGroup contactGroup;

  /**
   * Required. The contact group to create.
   * @return value or {@code null} for none
   */
  public ContactGroup getContactGroup() {
    return contactGroup;
  }

  /**
   * Required. The contact group to create.
   * @param contactGroup contactGroup or {@code null} for none
   */
  public CreateContactGroupRequest setContactGroup(ContactGroup contactGroup) {
    this.contactGroup = contactGroup;
    return this;
  }

  @Override
  public CreateContactGroupRequest set(String fieldName, Object value) {
    return (CreateContactGroupRequest) super.set(fieldName, value);
  }

  @Override
  public CreateContactGroupRequest clone() {
    return (CreateContactGroupRequest) super.clone();
  }

}
