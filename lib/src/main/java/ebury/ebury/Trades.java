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
import java.time.LocalDate;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.http.NameValuePair;

public class Trades {
	
	private SDKConfiguration sdkConfiguration;

	public Trades(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Get all trades
     * Get all the trades for a given client ID
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ebury.ebury.models.operations.GetTradesResponse getTrades(ebury.ebury.models.operations.GetTradesRequest request) throws Exception {
        String baseUrl = ebury.ebury.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = ebury.ebury.utils.Utils.generateURL(baseUrl, "/trades");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = ebury.ebury.utils.Utils.getQueryParams(ebury.ebury.models.operations.GetTradesRequest.class, request, null);
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

        ebury.ebury.models.operations.GetTradesResponse res = new ebury.ebury.models.operations.GetTradesResponse(contentType, httpRes.statusCode()) {{
            bookedTrades = null;
            errorMessage = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.BookedTrade[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.BookedTrade[].class);
                res.bookedTrades = out;
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
     * Get a trade
     * Get a trade with a specific trade_id
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ebury.ebury.models.operations.GetTradesTradeIdResponse getTradesTradeId(ebury.ebury.models.operations.GetTradesTradeIdRequest request) throws Exception {
        String baseUrl = ebury.ebury.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = ebury.ebury.utils.Utils.generateURL(ebury.ebury.models.operations.GetTradesTradeIdRequest.class, baseUrl, "/trades/{trade_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = ebury.ebury.utils.Utils.getQueryParams(ebury.ebury.models.operations.GetTradesTradeIdRequest.class, request, null);
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

        ebury.ebury.models.operations.GetTradesTradeIdResponse res = new ebury.ebury.models.operations.GetTradesTradeIdResponse(contentType, httpRes.statusCode()) {{
            bookedTrade = null;
            errorMessage = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.BookedTrade out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.BookedTrade.class);
                res.bookedTrade = out;
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
     * Create a Trade
     * Initiate a new trade. You need to have an existing quote_id to do this
     * 
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ebury.ebury.models.operations.PostTradesResponse postTrades(ebury.ebury.models.operations.PostTradesRequest request) throws Exception {
        String baseUrl = ebury.ebury.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = ebury.ebury.utils.Utils.generateURL(baseUrl, "/trades");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = ebury.ebury.utils.Utils.serializeRequestBody(request, "newTrade", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = ebury.ebury.utils.Utils.getQueryParams(ebury.ebury.models.operations.PostTradesRequest.class, request, null);
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

        ebury.ebury.models.operations.PostTradesResponse res = new ebury.ebury.models.operations.PostTradesResponse(contentType, httpRes.statusCode()) {{
            confirmedTrade = null;
            errorMessage = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201) {
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.ConfirmedTrade out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.ConfirmedTrade.class);
                res.confirmedTrade = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 403 || httpRes.statusCode() == 409 || httpRes.statusCode() == 502) {
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
}