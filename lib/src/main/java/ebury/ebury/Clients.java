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

public class Clients {
	
	private SDKConfiguration sdkConfiguration;

	public Clients(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Get clients
     * Get all clients for a contact.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public ebury.ebury.models.operations.ClientsGetResponse clientsGet(ebury.ebury.models.operations.ClientsGetRequest request) throws Exception {
        String baseUrl = ebury.ebury.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = ebury.ebury.utils.Utils.generateURL(baseUrl, "/clients");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
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

        ebury.ebury.models.operations.ClientsGetResponse res = new ebury.ebury.models.operations.ClientsGetResponse(contentType, httpRes.statusCode()) {{
            clients = null;
            errorMessage = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.Client[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.Client[].class);
                res.clients = out;
            }
        }
        else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 429) {
        }
        else if (httpRes.statusCode() == 502) {
            if (ebury.ebury.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                ebury.ebury.models.shared.ErrorMessage out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), ebury.ebury.models.shared.ErrorMessage.class);
                res.errorMessage = out;
            }
        }

        return res;
    }
}