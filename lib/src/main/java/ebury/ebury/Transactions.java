/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package ebury.ebury;

import com.fasterxml.jackson.databind.ObjectMapper;
import ebury.ebury.utils.HTTPClient;
import ebury.ebury.utils.HTTPRequest;
import ebury.ebury.utils.JSON;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.http.NameValuePair;

public class Transactions {
	
	private SDKConfiguration sdkConfiguration;

	public Transactions(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Get transactions for a single account
     * Retrieve all transactions for a single account by account ID, optionally filtered by value date and time with pagination support
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ebury.ebury.models.operations.GetAccountsAccountIdTransactionsResponse getAccountsAccountIdTransactions(ebury.ebury.models.operations.GetAccountsAccountIdTransactionsRequest request) throws Exception {
        String baseUrl = ebury.ebury.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = ebury.ebury.utils.Utils.generateURL(ebury.ebury.models.operations.GetAccountsAccountIdTransactionsRequest.class, baseUrl, "/accounts/{account_id}/transactions", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = ebury.ebury.utils.Utils.getQueryParams(ebury.ebury.models.operations.GetAccountsAccountIdTransactionsRequest.class, request, null);
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

        ebury.ebury.models.operations.GetAccountsAccountIdTransactionsResponse res = new ebury.ebury.models.operations.GetAccountsAccountIdTransactionsResponse(contentType, httpRes.statusCode()) {{
            transactionData = null;
            errorMessage = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.TransactionData[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.TransactionData[].class);
                res.transactionData = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 403 || httpRes.statusCode() == 502 || httpRes.statusCode() == 504) {
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
     * Get a single transactions for an account
     * Retrieve a single transaction for an account by account id and transaction id
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ebury.ebury.models.operations.GetAccountsAccountIdTransactionsTransactionIdResponse getAccountsAccountIdTransactionsTransactionId(ebury.ebury.models.operations.GetAccountsAccountIdTransactionsTransactionIdRequest request) throws Exception {
        String baseUrl = ebury.ebury.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = ebury.ebury.utils.Utils.generateURL(ebury.ebury.models.operations.GetAccountsAccountIdTransactionsTransactionIdRequest.class, baseUrl, "/accounts/{account_id}/transactions/{transaction_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = ebury.ebury.utils.Utils.getQueryParams(ebury.ebury.models.operations.GetAccountsAccountIdTransactionsTransactionIdRequest.class, request, null);
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

        ebury.ebury.models.operations.GetAccountsAccountIdTransactionsTransactionIdResponse res = new ebury.ebury.models.operations.GetAccountsAccountIdTransactionsTransactionIdResponse(contentType, httpRes.statusCode()) {{
            transactionData = null;
            errorMessage = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.TransactionData out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.TransactionData.class);
                res.transactionData = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 403 || httpRes.statusCode() == 502 || httpRes.statusCode() == 504) {
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
     * Get transactions for all client accounts
     * Retrieve a list of the client's transactions, optionally filtered by currency and value date and time with pagination support
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ebury.ebury.models.operations.GetTransactionsResponse getTransactions(ebury.ebury.models.operations.GetTransactionsRequest request) throws Exception {
        String baseUrl = ebury.ebury.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = ebury.ebury.utils.Utils.generateURL(baseUrl, "/transactions");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = ebury.ebury.utils.Utils.getQueryParams(ebury.ebury.models.operations.GetTransactionsRequest.class, request, null);
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

        ebury.ebury.models.operations.GetTransactionsResponse res = new ebury.ebury.models.operations.GetTransactionsResponse(contentType, httpRes.statusCode()) {{
            transactionData = null;
            errorMessage = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.TransactionData[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.TransactionData[].class);
                res.transactionData = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 403 || httpRes.statusCode() == 502 || httpRes.statusCode() == 504) {
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
}