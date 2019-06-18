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

package com.google.api.services.cloudscheduler.v1.model;

/**
 * Http target. The job will be pushed to the job handler by means of an HTTP request via an
 * http_method such as HTTP POST, HTTP GET, etc. The job is acknowledged by means of an HTTP
 * response code in the range [200 - 299]. A failure to receive a response constitutes a failed
 * execution. For a redirected request, the response returned by the redirected request is
 * considered.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Scheduler API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HttpTarget extends com.google.api.client.json.GenericJson {

  /**
   * HTTP request body. A request body is allowed only if the HTTP method is POST, PUT, or PATCH. It
   * is an error to set body on a job with an incompatible HttpMethod.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String body;

  /**
   * The user can specify HTTP request headers to send with the job's HTTP request. This map
   * contains the header field names and values. Repeated headers are not supported, but a header
   * value can contain commas. These headers represent a subset of the headers that will accompany
   * the job's HTTP request. Some HTTP request headers will be ignored or replaced. A partial list
   * of headers that will be ignored or replaced is below: - Host: This will be computed by Cloud
   * Scheduler and derived from uri. * `Content-Length`: This will be computed by Cloud Scheduler. *
   * `User-Agent`: This will be set to `"Google-Cloud-Scheduler"`. * `X-Google-*`: Google internal
   * use only. * `X-AppEngine-*`: Google internal use only.
   *
   * The total size of headers must be less than 80KB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> headers;

  /**
   * Which HTTP method to use for the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String httpMethod;

  /**
   * If specified, an [OAuth token](https://developers.google.com/identity/protocols/OAuth2) will be
   * generated and attached as an `Authorization` header in the HTTP request.
   *
   * This type of authorization should generally only be used when calling Google APIs hosted on
   * *.googleapis.com.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OAuthToken oauthToken;

  /**
   * If specified, an [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect) token
   * will be generated and attached as an `Authorization` header in the HTTP request.
   *
   * This type of authorization can be used for many scenarios, including calling Cloud Run, or
   * endpoints where you intend to validate the token yourself.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OidcToken oidcToken;

  /**
   * Required.
   *
   * The full URI path that the request will be sent to. This string must begin with either
   * "http://" or "https://". Some examples of valid values for uri are: `http://acme.com` and
   * `https://acme.com/sales:8080`. Cloud Scheduler will encode some characters for safety and
   * compatibility. The maximum allowed URL length is 2083 characters after encoding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * HTTP request body. A request body is allowed only if the HTTP method is POST, PUT, or PATCH. It
   * is an error to set body on a job with an incompatible HttpMethod.
   * @see #decodeBody()
   * @return value or {@code null} for none
   */
  public java.lang.String getBody() {
    return body;
  }

  /**
   * HTTP request body. A request body is allowed only if the HTTP method is POST, PUT, or PATCH. It
   * is an error to set body on a job with an incompatible HttpMethod.
   * @see #getBody()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeBody() {
    return com.google.api.client.util.Base64.decodeBase64(body);
  }

  /**
   * HTTP request body. A request body is allowed only if the HTTP method is POST, PUT, or PATCH. It
   * is an error to set body on a job with an incompatible HttpMethod.
   * @see #encodeBody()
   * @param body body or {@code null} for none
   */
  public HttpTarget setBody(java.lang.String body) {
    this.body = body;
    return this;
  }

  /**
   * HTTP request body. A request body is allowed only if the HTTP method is POST, PUT, or PATCH. It
   * is an error to set body on a job with an incompatible HttpMethod.
   * @see #setBody()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public HttpTarget encodeBody(byte[] body) {
    this.body = com.google.api.client.util.Base64.encodeBase64URLSafeString(body);
    return this;
  }

  /**
   * The user can specify HTTP request headers to send with the job's HTTP request. This map
   * contains the header field names and values. Repeated headers are not supported, but a header
   * value can contain commas. These headers represent a subset of the headers that will accompany
   * the job's HTTP request. Some HTTP request headers will be ignored or replaced. A partial list
   * of headers that will be ignored or replaced is below: - Host: This will be computed by Cloud
   * Scheduler and derived from uri. * `Content-Length`: This will be computed by Cloud Scheduler. *
   * `User-Agent`: This will be set to `"Google-Cloud-Scheduler"`. * `X-Google-*`: Google internal
   * use only. * `X-AppEngine-*`: Google internal use only.
   *
   * The total size of headers must be less than 80KB.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getHeaders() {
    return headers;
  }

  /**
   * The user can specify HTTP request headers to send with the job's HTTP request. This map
   * contains the header field names and values. Repeated headers are not supported, but a header
   * value can contain commas. These headers represent a subset of the headers that will accompany
   * the job's HTTP request. Some HTTP request headers will be ignored or replaced. A partial list
   * of headers that will be ignored or replaced is below: - Host: This will be computed by Cloud
   * Scheduler and derived from uri. * `Content-Length`: This will be computed by Cloud Scheduler. *
   * `User-Agent`: This will be set to `"Google-Cloud-Scheduler"`. * `X-Google-*`: Google internal
   * use only. * `X-AppEngine-*`: Google internal use only.
   *
   * The total size of headers must be less than 80KB.
   * @param headers headers or {@code null} for none
   */
  public HttpTarget setHeaders(java.util.Map<String, java.lang.String> headers) {
    this.headers = headers;
    return this;
  }

  /**
   * Which HTTP method to use for the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getHttpMethod() {
    return httpMethod;
  }

  /**
   * Which HTTP method to use for the request.
   * @param httpMethod httpMethod or {@code null} for none
   */
  public HttpTarget setHttpMethod(java.lang.String httpMethod) {
    this.httpMethod = httpMethod;
    return this;
  }

  /**
   * If specified, an [OAuth token](https://developers.google.com/identity/protocols/OAuth2) will be
   * generated and attached as an `Authorization` header in the HTTP request.
   *
   * This type of authorization should generally only be used when calling Google APIs hosted on
   * *.googleapis.com.
   * @return value or {@code null} for none
   */
  public OAuthToken getOauthToken() {
    return oauthToken;
  }

  /**
   * If specified, an [OAuth token](https://developers.google.com/identity/protocols/OAuth2) will be
   * generated and attached as an `Authorization` header in the HTTP request.
   *
   * This type of authorization should generally only be used when calling Google APIs hosted on
   * *.googleapis.com.
   * @param oauthToken oauthToken or {@code null} for none
   */
  public HttpTarget setOauthToken(OAuthToken oauthToken) {
    this.oauthToken = oauthToken;
    return this;
  }

  /**
   * If specified, an [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect) token
   * will be generated and attached as an `Authorization` header in the HTTP request.
   *
   * This type of authorization can be used for many scenarios, including calling Cloud Run, or
   * endpoints where you intend to validate the token yourself.
   * @return value or {@code null} for none
   */
  public OidcToken getOidcToken() {
    return oidcToken;
  }

  /**
   * If specified, an [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect) token
   * will be generated and attached as an `Authorization` header in the HTTP request.
   *
   * This type of authorization can be used for many scenarios, including calling Cloud Run, or
   * endpoints where you intend to validate the token yourself.
   * @param oidcToken oidcToken or {@code null} for none
   */
  public HttpTarget setOidcToken(OidcToken oidcToken) {
    this.oidcToken = oidcToken;
    return this;
  }

  /**
   * Required.
   *
   * The full URI path that the request will be sent to. This string must begin with either
   * "http://" or "https://". Some examples of valid values for uri are: `http://acme.com` and
   * `https://acme.com/sales:8080`. Cloud Scheduler will encode some characters for safety and
   * compatibility. The maximum allowed URL length is 2083 characters after encoding.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Required.
   *
   * The full URI path that the request will be sent to. This string must begin with either
   * "http://" or "https://". Some examples of valid values for uri are: `http://acme.com` and
   * `https://acme.com/sales:8080`. Cloud Scheduler will encode some characters for safety and
   * compatibility. The maximum allowed URL length is 2083 characters after encoding.
   * @param uri uri or {@code null} for none
   */
  public HttpTarget setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public HttpTarget set(String fieldName, Object value) {
    return (HttpTarget) super.set(fieldName, value);
  }

  @Override
  public HttpTarget clone() {
    return (HttpTarget) super.clone();
  }

}
