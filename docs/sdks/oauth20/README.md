# oAuth20

### Available Operations

* [getAuthenticate](#getauthenticate) - Authenticate
* [getInfoAvailableContacts](#getinfoavailablecontacts) - Available contacts
* [postAuthenticate](#postauthenticate) - Authenticate
* [postLogin](#postlogin) - Login
* [postSendVerificationCode](#postsendverificationcode) - Send verification code
* [postToken](#posttoken) - Token
* [postVerify](#postverify) - Verify

## getAuthenticate

Retrieve the login template

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.GetAuthenticateRequest;
import ebury.ebury.models.operations.GetAuthenticateResponse;
import ebury.ebury.models.operations.GetAuthenticateResponseType;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("totam") {{
                    apiKey = "";
                }})
                .build();

            GetAuthenticateRequest req = new GetAuthenticateRequest("incidunt", "aspernatur", GetAuthenticateResponseType.CODE, "dolores", "distinctio");            

            GetAuthenticateResponse res = sdk.oAuth20.getAuthenticate(req);

            if (res.getAuthenticate200ApplicationJSONString != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [ebury.ebury.models.operations.GetAuthenticateRequest](../../models/operations/GetAuthenticateRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |


### Response

**[ebury.ebury.models.operations.GetAuthenticateResponse](../../models/operations/GetAuthenticateResponse.md)**


## getInfoAvailableContacts

Get the available contacts of a client

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.GetInfoAvailableContactsRequest;
import ebury.ebury.models.operations.GetInfoAvailableContactsResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("facilis") {{
                    apiKey = "";
                }})
                .build();

            GetInfoAvailableContactsRequest req = new GetInfoAvailableContactsRequest();            

            GetInfoAvailableContactsResponse res = sdk.oAuth20.getInfoAvailableContacts(req);

            if (res.contactsList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [ebury.ebury.models.operations.GetInfoAvailableContactsRequest](../../models/operations/GetInfoAvailableContactsRequest.md) | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |


### Response

**[ebury.ebury.models.operations.GetInfoAvailableContactsResponse](../../models/operations/GetInfoAvailableContactsResponse.md)**


## postAuthenticate

Retrieve the login template

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.PostAuthenticateResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("aliquid") {{
                    apiKey = "";
                }})
                .build();

            ebury.ebury.models.. req = "quam".getBytes()            

            PostAuthenticateResponse res = sdk.oAuth20.postAuthenticate(req);

            if (res.postAuthenticate200ApplicationJSONString != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [byte[]](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[ebury.ebury.models.operations.PostAuthenticateResponse](../../models/operations/PostAuthenticateResponse.md)**


## postLogin

Retrieve the login template

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.PostLoginPassword;
import ebury.ebury.models.operations.PostLoginRequest;
import ebury.ebury.models.operations.PostLoginResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("molestias") {{
                    apiKey = "";
                }})
                .build();

            PostLoginRequest req = new PostLoginRequest("temporibus".getBytes(), PostLoginPassword.CODE);            

            PostLoginResponse res = sdk.oAuth20.postLogin(req);

            if (res.postLogin200ApplicationJSONString != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ebury.ebury.models.operations.PostLoginRequest](../../models/operations/PostLoginRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |


### Response

**[ebury.ebury.models.operations.PostLoginResponse](../../models/operations/PostLoginResponse.md)**


## postSendVerificationCode

Send 2fa verification code in case the user did not recived the past ones

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.PostSendVerificationCodeRequest;
import ebury.ebury.models.operations.PostSendVerificationCodeResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("qui") {{
                    apiKey = "";
                }})
                .build();

            PostSendVerificationCodeRequest req = new PostSendVerificationCodeRequest("neque", "fugit");            

            PostSendVerificationCodeResponse res = sdk.oAuth20.postSendVerificationCode(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [ebury.ebury.models.operations.PostSendVerificationCodeRequest](../../models/operations/PostSendVerificationCodeRequest.md) | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |


### Response

**[ebury.ebury.models.operations.PostSendVerificationCodeResponse](../../models/operations/PostSendVerificationCodeResponse.md)**


## postToken

Get an access token or refresh an existing one. The access token is passed in the Authorization header parameter in endpoints that require authentication.

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.PostTokenRequest;
import ebury.ebury.models.operations.PostTokenResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("magni") {{
                    apiKey = "";
                }})
                .build();

            PostTokenRequest req = new PostTokenRequest() {{
                requestBody = "odio".getBytes();
            }};            

            PostTokenResponse res = sdk.oAuth20.postToken(req);

            if (res.postTokenResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ebury.ebury.models.operations.PostTokenRequest](../../models/operations/PostTokenRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |


### Response

**[ebury.ebury.models.operations.PostTokenResponse](../../models/operations/PostTokenResponse.md)**


## postVerify

Validate 2FA code

### Example Usage

```java
package hello.world;

import ebury.ebury.Ebury;
import ebury.ebury.models.operations.PostVerifyRequest;
import ebury.ebury.models.operations.PostVerifyResponse;
import ebury.ebury.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Ebury sdk = Ebury.builder()
                .setSecurity(new Security("sunt") {{
                    apiKey = "";
                }})
                .build();

            PostVerifyRequest req = new PostVerifyRequest("ullam".getBytes(), "nam", "hic", "voluptatem");            

            PostVerifyResponse res = sdk.oAuth20.postVerify(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ebury.ebury.models.operations.PostVerifyRequest](../../models/operations/PostVerifyRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |


### Response

**[ebury.ebury.models.operations.PostVerifyResponse](../../models/operations/PostVerifyResponse.md)**

