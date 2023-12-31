# BankAccount

The data of the bank account. Refer to the Metadata API for valid field combinations.


## Fields

| Field                                                                                                                                                                                                                | Type                                                                                                                                                                                                                 | Required                                                                                                                                                                                                             | Description                                                                                                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `accountId`                                                                                                                                                                                                          | *Long*                                                                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                                                                   | The identifier of the bank account.                                                                                                                                                                                  |
| `accountNumber`                                                                                                                                                                                                      | *String*                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                   | The account number of the bank account.                                                                                                                                                                              |
| `bankAddressLine1`                                                                                                                                                                                                   | *String*                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                   | The first address line of the bank.                                                                                                                                                                                  |
| `bankCountryCode`                                                                                                                                                                                                    | *String*                                                                                                                                                                                                             | :heavy_check_mark:                                                                                                                                                                                                   | The ISO 3166-1 alpha-2 code of the bank's country.                                                                                                                                                                   |
| `bankCurrencyCode`                                                                                                                                                                                                   | *String*                                                                                                                                                                                                             | :heavy_check_mark:                                                                                                                                                                                                   | The ISO 4217 code of the bank account's currency.                                                                                                                                                                    |
| `bankIdentifier`                                                                                                                                                                                                     | *String*                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                   | The identifier of the bank.                                                                                                                                                                                          |
| `bankName`                                                                                                                                                                                                           | *String*                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                   | Name of the bank account holder.                                                                                                                                                                                     |
| `correspondentAccount`                                                                                                                                                                                               | *String*                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                   | The account for the correspondant account of the bank.                                                                                                                                                               |
| `correspondentSwiftCode`                                                                                                                                                                                             | *String*                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                   | The SWIFT code for the correspondant account of the bank.                                                                                                                                                            |
| `iban`                                                                                                                                                                                                               | *String*                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                   | The IBAN of the bank account.                                                                                                                                                                                        |
| `inn`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                   | The INN of the bank account.                                                                                                                                                                                         |
| `kbk`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                   | The KBK of the bank account.                                                                                                                                                                                         |
| `kio`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                   | The KIO of the bank account.                                                                                                                                                                                         |
| `kpp`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                   | The KPP of the bank account.                                                                                                                                                                                         |
| `purposeOfPayment`                                                                                                                                                                                                   | [BankAccountPurposeOfPayment](../../models/shared/BankAccountPurposeOfPayment.md)                                                                                                                                    | :heavy_minus_sign:                                                                                                                                                                                                   | Text explaining the purpose of payment. Required by the Central Bank for all payments sent to China (CHN) in the Chinese Renminbi (CNY) currency or United Arab Emirates in any currency (GDE to RDA) [Coming soon]. |
| `reasonForTrade`                                                                                                                                                                                                     | *String*                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                   | The reason for trade of the bank account.                                                                                                                                                                            |
| `referenceInformation`                                                                                                                                                                                               | *String*                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                   | The reference information of the bank account.                                                                                                                                                                       |
| `russianCentralBankAccount`                                                                                                                                                                                          | *String*                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                   | The Russian central account number of the bank account.                                                                                                                                                              |
| `swiftCode`                                                                                                                                                                                                          | *String*                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                   | The SWIFT code of the bank account.                                                                                                                                                                                  |
| `vo`                                                                                                                                                                                                                 | *String*                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                   | The VO of the bank account.                                                                                                                                                                                          |