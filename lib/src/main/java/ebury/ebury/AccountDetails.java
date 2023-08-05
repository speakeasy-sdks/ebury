/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury;

import com.fasterxml.jackson.databind.ObjectMapper;
import ebury.ebury.utils.HTTPClient;
import ebury.ebury.utils.HTTPRequest;
import ebury.ebury.utils.JSON;
import ebury.ebury.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.http.NameValuePair;

public class AccountDetails {
	
	private SDKConfiguration sdkConfiguration;

	public AccountDetails(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Get the list of account details of the referred client
     * Retrieve the account details of the client, possibly filtered by some criteria
     * 
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ebury.ebury.models.operations.GetAccountDetailsResponse getAccountDetails(ebury.ebury.models.operations.GetAccountDetailsRequest request) throws Exception {
        String baseUrl = ebury.ebury.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = ebury.ebury.utils.Utils.generateURL(baseUrl, "/account-details");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = ebury.ebury.utils.Utils.getQueryParams(ebury.ebury.models.operations.GetAccountDetailsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        java.util.Map<String, java.util.List<String>> headers = ebury.ebury.utils.Utils.getHeaders(request);
        if (headers != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> header : headers.entrySet()) {
                for (String value : header.getValue()) {
                    req.addHeader(header.getKey(), value);
                }
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ebury.ebury.models.operations.GetAccountDetailsResponse res = new ebury.ebury.models.operations.GetAccountDetailsResponse(contentType, httpRes.statusCode()) {{
            getAccountDetailsDomesticInternationalResponse = null;
            errorMessage = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.AccountDetailsDomesticInternationalResponse[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.AccountDetailsDomesticInternationalResponse[].class);
                res.getAccountDetailsDomesticInternationalResponse = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 403) {
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.ErrorMessage out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.ErrorMessage.class);
                res.errorMessage = out;
            }
        }
        else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 429) {
        }

        return res;
    }

    /**
     * Update the alias of an account details
     * Change the alias of the referred account details.
     * Only dedicated accounts can be patched, trying to patch a pooled account will return an error.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ebury.ebury.models.operations.PatchAccountDetailsAccountDetailsIdResponse patchAccountDetailsAccountDetailsId(ebury.ebury.models.operations.PatchAccountDetailsAccountDetailsIdRequest request) throws Exception {
        String baseUrl = ebury.ebury.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = ebury.ebury.utils.Utils.generateURL(ebury.ebury.models.operations.PatchAccountDetailsAccountDetailsIdRequest.class, baseUrl, "/account-details/{account_details_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = ebury.ebury.utils.Utils.serializeRequestBody(request, "patchAccountDetailsRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = ebury.ebury.utils.Utils.getQueryParams(ebury.ebury.models.operations.PatchAccountDetailsAccountDetailsIdRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        java.util.Map<String, java.util.List<String>> headers = ebury.ebury.utils.Utils.getHeaders(request);
        if (headers != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> header : headers.entrySet()) {
                for (String value : header.getValue()) {
                    req.addHeader(header.getKey(), value);
                }
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ebury.ebury.models.operations.PatchAccountDetailsAccountDetailsIdResponse res = new ebury.ebury.models.operations.PatchAccountDetailsAccountDetailsIdResponse(contentType, httpRes.statusCode()) {{
            accountDetailsDomesticInternationalResponse = null;
            errorMessage = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.AccountDetailsDomesticInternationalResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.AccountDetailsDomesticInternationalResponse.class);
                res.accountDetailsDomesticInternationalResponse = out;
            }
        }
        else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 429) {
        }
        else if (httpRes.statusCode() == 404 || httpRes.statusCode() == 405 || httpRes.statusCode() == 422) {
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.ErrorMessage out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.ErrorMessage.class);
                res.errorMessage = out;
            }
        }

        return res;
    }

    /**
     * Mark the account as primary (default) for its holder and currency
     * Mark the account as primary (default) for its holder and currency.
     * Only dedicated accounts can be set as primary, trying this operation for a pooled account will return an error.
     * 
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ebury.ebury.models.operations.PostAccountDetailsAccountDetailsIdMakeDefaultResponse postAccountDetailsAccountDetailsIdMakeDefault(ebury.ebury.models.operations.PostAccountDetailsAccountDetailsIdMakeDefaultRequest request) throws Exception {
        String baseUrl = ebury.ebury.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = ebury.ebury.utils.Utils.generateURL(ebury.ebury.models.operations.PostAccountDetailsAccountDetailsIdMakeDefaultRequest.class, baseUrl, "/account-details/{account_details_id}/make-default", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = ebury.ebury.utils.Utils.getQueryParams(ebury.ebury.models.operations.PostAccountDetailsAccountDetailsIdMakeDefaultRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        java.util.Map<String, java.util.List<String>> headers = ebury.ebury.utils.Utils.getHeaders(request);
        if (headers != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> header : headers.entrySet()) {
                for (String value : header.getValue()) {
                    req.addHeader(header.getKey(), value);
                }
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        ebury.ebury.models.operations.PostAccountDetailsAccountDetailsIdMakeDefaultResponse res = new ebury.ebury.models.operations.PostAccountDetailsAccountDetailsIdMakeDefaultResponse(contentType, httpRes.statusCode()) {{
            errorMessage = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204 || httpRes.statusCode() == 401 || httpRes.statusCode() == 429) {
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 405 || httpRes.statusCode() == 409) {
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.ErrorMessage out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.ErrorMessage.class);
                res.errorMessage = out;
            }
        }

        return res;
    }
}