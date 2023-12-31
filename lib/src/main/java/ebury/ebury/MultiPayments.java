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

public class MultiPayments {
	
	private SDKConfiguration sdkConfiguration;

	public MultiPayments(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Rejects a multi payment
     * Rejects a multi payment trade and cancels the payments
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ebury.ebury.models.operations.DeleteMultipaymentsMultipaymentIdResponse deleteMultipaymentsMultipaymentId(ebury.ebury.models.operations.DeleteMultipaymentsMultipaymentIdRequest request) throws Exception {
        String baseUrl = ebury.ebury.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = ebury.ebury.utils.Utils.generateURL(ebury.ebury.models.operations.DeleteMultipaymentsMultipaymentIdRequest.class, baseUrl, "/multipayments/{multipayment_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = ebury.ebury.utils.Utils.getQueryParams(ebury.ebury.models.operations.DeleteMultipaymentsMultipaymentIdRequest.class, request, null);
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

        ebury.ebury.models.operations.DeleteMultipaymentsMultipaymentIdResponse res = new ebury.ebury.models.operations.DeleteMultipaymentsMultipaymentIdResponse(contentType, httpRes.statusCode()) {{
            errorMessage = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204 || httpRes.statusCode() == 401 || httpRes.statusCode() == 404 || httpRes.statusCode() == 409) {
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 403 || httpRes.statusCode() == 502) {
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.ErrorMessage out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.ErrorMessage.class);
                res.errorMessage = out;
            }
        }

        return res;
    }

    /**
     * Fetch payment instructions of a mass payment
     * Fetch payment instructions of a mass payment
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ebury.ebury.models.operations.GetMassPaymentsResponse getMassPayments(ebury.ebury.models.operations.GetMassPaymentsRequest request) throws Exception {
        String baseUrl = ebury.ebury.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = ebury.ebury.utils.Utils.generateURL(baseUrl, "/mass-payments");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = ebury.ebury.utils.Utils.getQueryParams(ebury.ebury.models.operations.GetMassPaymentsRequest.class, request, null);
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

        ebury.ebury.models.operations.GetMassPaymentsResponse res = new ebury.ebury.models.operations.GetMassPaymentsResponse(contentType, httpRes.statusCode()) {{
            getMassPaymentsResponse = null;
            errorMessage = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.GetMassPaymentItem[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.GetMassPaymentItem[].class);
                res.getMassPaymentsResponse = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 403 || httpRes.statusCode() == 502) {
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.ErrorMessage out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.ErrorMessage.class);
                res.errorMessage = out;
            }
        }
        else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 409 || httpRes.statusCode() == 429) {
        }

        return res;
    }

    /**
     * Fetch the payment instructions with errors for a mass payment
     * Fetch the payment instructions with errors for a mass payment
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ebury.ebury.models.operations.GetMassPaymentsMassPaymentIdErrorsResponse getMassPaymentsMassPaymentIdErrors(ebury.ebury.models.operations.GetMassPaymentsMassPaymentIdErrorsRequest request) throws Exception {
        String baseUrl = ebury.ebury.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = ebury.ebury.utils.Utils.generateURL(ebury.ebury.models.operations.GetMassPaymentsMassPaymentIdErrorsRequest.class, baseUrl, "/mass-payments/{mass_payment_id}/errors", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = ebury.ebury.utils.Utils.getQueryParams(ebury.ebury.models.operations.GetMassPaymentsMassPaymentIdErrorsRequest.class, request, null);
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

        ebury.ebury.models.operations.GetMassPaymentsMassPaymentIdErrorsResponse res = new ebury.ebury.models.operations.GetMassPaymentsMassPaymentIdErrorsResponse(contentType, httpRes.statusCode()) {{
            massPaymentErrorsResponse = null;
            errorMessage = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.PaymentInstructionWithErrors[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.PaymentInstructionWithErrors[].class);
                res.massPaymentErrorsResponse = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 403 || httpRes.statusCode() == 502) {
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.ErrorMessage out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.ErrorMessage.class);
                res.errorMessage = out;
            }
        }
        else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 409 || httpRes.statusCode() == 429) {
        }

        return res;
    }

    /**
     * Fetch the payment instructions submitted for a mass payment
     * Fetch the payment instructions submitted for a mass payment
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ebury.ebury.models.operations.GetMassPaymentsMassPaymentIdPaymentsReceivedResponse getMassPaymentsMassPaymentIdPaymentsReceived(ebury.ebury.models.operations.GetMassPaymentsMassPaymentIdPaymentsReceivedRequest request) throws Exception {
        String baseUrl = ebury.ebury.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = ebury.ebury.utils.Utils.generateURL(ebury.ebury.models.operations.GetMassPaymentsMassPaymentIdPaymentsReceivedRequest.class, baseUrl, "/mass-payments/{mass_payment_id}/payments-received", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = ebury.ebury.utils.Utils.getQueryParams(ebury.ebury.models.operations.GetMassPaymentsMassPaymentIdPaymentsReceivedRequest.class, request, null);
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

        ebury.ebury.models.operations.GetMassPaymentsMassPaymentIdPaymentsReceivedResponse res = new ebury.ebury.models.operations.GetMassPaymentsMassPaymentIdPaymentsReceivedResponse(contentType, httpRes.statusCode()) {{
            massPaymentPaymentsReceivedResponse = null;
            errorMessage = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.NewMultiPaymentItem[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.NewMultiPaymentItem[].class);
                res.massPaymentPaymentsReceivedResponse = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 403 || httpRes.statusCode() == 502) {
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.ErrorMessage out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.ErrorMessage.class);
                res.errorMessage = out;
            }
        }
        else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 409 || httpRes.statusCode() == 429) {
        }

        return res;
    }

    /**
     * Accept a multi payment
     * Accept a multi payment generated trade and book in payments
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ebury.ebury.models.operations.PatchMultipaymentsMultipaymentIdResponse patchMultipaymentsMultipaymentId(ebury.ebury.models.operations.PatchMultipaymentsMultipaymentIdRequest request) throws Exception {
        String baseUrl = ebury.ebury.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = ebury.ebury.utils.Utils.generateURL(ebury.ebury.models.operations.PatchMultipaymentsMultipaymentIdRequest.class, baseUrl, "/multipayments/{multipayment_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = ebury.ebury.utils.Utils.getQueryParams(ebury.ebury.models.operations.PatchMultipaymentsMultipaymentIdRequest.class, request, null);
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

        ebury.ebury.models.operations.PatchMultipaymentsMultipaymentIdResponse res = new ebury.ebury.models.operations.PatchMultipaymentsMultipaymentIdResponse(contentType, httpRes.statusCode()) {{
            bankAccount = null;
            errorMessage = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.BankAccount out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.BankAccount.class);
                res.bankAccount = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 403 || httpRes.statusCode() == 502) {
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.ErrorMessage out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.ErrorMessage.class);
                res.errorMessage = out;
            }
        }
        else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 404 || httpRes.statusCode() == 409) {
        }

        return res;
    }

    /**
     * Create a mass payment instruction
     * Submit mass payment request in async mode. Requires either a sell currency or existing trade ID to create the instruction
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ebury.ebury.models.operations.PostMassPaymentsResponse postMassPayments(ebury.ebury.models.operations.PostMassPaymentsRequest request) throws Exception {
        String baseUrl = ebury.ebury.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = ebury.ebury.utils.Utils.generateURL(baseUrl, "/mass-payments");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = ebury.ebury.utils.Utils.serializeRequestBody(request, "newMassPayment", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = ebury.ebury.utils.Utils.getQueryParams(ebury.ebury.models.operations.PostMassPaymentsRequest.class, request, null);
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

        ebury.ebury.models.operations.PostMassPaymentsResponse res = new ebury.ebury.models.operations.PostMassPaymentsResponse(contentType, httpRes.statusCode()) {{
            massPaymentResponse = null;
            errorMessage = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 202) {
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.MassPaymentResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.MassPaymentResponse.class);
                res.massPaymentResponse = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 403 || httpRes.statusCode() == 502) {
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.ErrorMessage out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.ErrorMessage.class);
                res.errorMessage = out;
            }
        }
        else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 404) {
        }

        return res;
    }

    /**
     * Confirm multi payment instructions
     * Confirm (commit) mass payment instructions, which can be hold because `auto_commit` was false, or because there were some errors.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ebury.ebury.models.operations.PostMassPaymentsDollarMassPaymentIdConfirmResponse postMassPaymentsDollarMassPaymentIdConfirm(ebury.ebury.models.operations.PostMassPaymentsDollarMassPaymentIdConfirmRequest request) throws Exception {
        String baseUrl = ebury.ebury.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = ebury.ebury.utils.Utils.generateURL(baseUrl, "/mass-payments/$mass_payment_id/confirm");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = ebury.ebury.utils.Utils.getQueryParams(ebury.ebury.models.operations.PostMassPaymentsDollarMassPaymentIdConfirmRequest.class, request, null);
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

        ebury.ebury.models.operations.PostMassPaymentsDollarMassPaymentIdConfirmResponse res = new ebury.ebury.models.operations.PostMassPaymentsDollarMassPaymentIdConfirmResponse(contentType, httpRes.statusCode()) {{
            massPaymentResponse = null;
            errorMessage = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 202) {
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.MassPaymentResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.MassPaymentResponse.class);
                res.massPaymentResponse = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 403 || httpRes.statusCode() == 502) {
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.ErrorMessage out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.ErrorMessage.class);
                res.errorMessage = out;
            }
        }
        else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 404) {
        }

        return res;
    }

    /**
     * Create a multi payment instruction
     * Create a new multi payment instruction. Requires either a sell currency or existing trade ID to create the instruction
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ebury.ebury.models.operations.PostMultipaymentsResponse postMultipayments(ebury.ebury.models.operations.PostMultipaymentsRequest request) throws Exception {
        String baseUrl = ebury.ebury.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = ebury.ebury.utils.Utils.generateURL(baseUrl, "/multipayments");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = ebury.ebury.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = ebury.ebury.utils.Utils.getQueryParams(ebury.ebury.models.operations.PostMultipaymentsRequest.class, request, null);
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

        ebury.ebury.models.operations.PostMultipaymentsResponse res = new ebury.ebury.models.operations.PostMultipaymentsResponse(contentType, httpRes.statusCode()) {{
            multiPaymentResponse = null;
            errorMessage = null;
            multiPaymentErrorMessage = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201 || httpRes.statusCode() == 202) {
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.MultiPaymentResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.MultiPaymentResponse.class);
                res.multiPaymentResponse = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 403 || httpRes.statusCode() == 502) {
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.ErrorMessage out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.ErrorMessage.class);
                res.errorMessage = out;
            }
        }
        else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 404) {
        }
        else if (httpRes.statusCode() == 409) {
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.MultiPaymentError[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.MultiPaymentError[].class);
                res.multiPaymentErrorMessage = out;
            }
        }

        return res;
    }
}