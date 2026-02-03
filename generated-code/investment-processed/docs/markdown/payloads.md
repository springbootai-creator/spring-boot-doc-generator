# /api/investments
#### Resource Structure:

<table style="border-collapse:collapse;width:100%;table-layout:auto"><thead><tr><th style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Field</th><th style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Type</th><th style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Description</th></tr></thead><tbody><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">id</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Long</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Unique identifier for the investment</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">type</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">String</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Type of the investment</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">amountUSD</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Double</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Amount of the investment in USD</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">investmentDate</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Date</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Date of the investment</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">personId</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Long</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">ID of the associated person</td></tr></tbody></table>
### POST https://api.example.com/api/investments
Creates a new investment.
Request:



```json
{
  "type": "Stocks",
  "amountUSD": 1000.0,
  "investmentDate": "2023-10-01",
  "personId": 1
}
```

Response:



```json
{
  "id": 1,
  "type": "Stocks",
  "amountUSD": 1000.0,
  "investmentDate": "2023-10-01",
  "personId": 1
}
```


### GET https://api.example.com/api/investments/person/{personId}
Retrieves investments by person ID.
Request:



```json
{}
```

Response:



```json
[
  {
    "id": 1,
    "type": "Stocks",
    "amountUSD": 1000.0,
    "investmentDate": "2023-10-01",
    "personId": 1
  },
  {
    "id": 2,
    "type": "Bonds",
    "amountUSD": 500.0,
    "investmentDate": "2023-09-15",
    "personId": 1
  }
]
```


### GET https://api.example.com/api/investments/person/{personId}/total
Calculates the total invested amount by person.
Request:



```json
{}
```

Response:



```json
1000.0
```


### PUT https://api.example.com/api/investments/{id}
Updates an existing investment.
Request:



```json
{
  "type": "Bonds",
  "amountUSD": 1500.0,
  "investmentDate": "2023-10-05",
  "personId": 1
}
```

Response:



```json
{
  "id": 1,
  "type": "Bonds",
  "amountUSD": 1500.0,
  "investmentDate": "2023-10-05",
  "personId": 1
}
```


### DELETE https://api.example.com/api/investments/{id}
Deletes an investment.
Request:



```json
{}
```

Response:



```json
{}
```


# /api/persons
#### Resource Structure:

<table style="border-collapse:collapse;width:100%;table-layout:auto"><thead><tr><th style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Field</th><th style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Type</th><th style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Description</th></tr></thead><tbody><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">id</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Long</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Unique identifier for the person</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">fullName</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">String</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Full name of the person</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">email</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">String</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Email address of the person</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">taxId</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">String</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Tax identification number</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">investments</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">List&lt;InvestmentDTO&gt;</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">List of associated investments</td></tr></tbody></table>
### POST https://api.example.com/api/persons
Creates a new person.
Request:



```json
{
  "fullName": "John Doe",
  "email": "john.doe@example.com",
  "taxId": "123-45-6789"
}
```

Response:



```json
{
  "id": 1,
  "fullName": "John Doe",
  "email": "john.doe@example.com",
  "taxId": "123-45-6789",
  "investments": []
}
```


### GET https://api.example.com/api/persons
Retrieves all persons.
Request:



```json
{}
```

Response:



```json
[
  {
    "id": 1,
    "fullName": "John Doe",
    "email": "john.doe@example.com",
    "taxId": "123-45-6789",
    "investments": []
  },
  {
    "id": 2,
    "fullName": "Jane Smith",
    "email": "jane.smith@example.com",
    "taxId": "987-65-4321",
    "investments": []
  }
]
```


### GET https://api.example.com/api/persons/{id}
Retrieves a person by their ID.
Request:



```json
{}
```

Response:



```json
{
  "id": 1,
  "fullName": "John Doe",
  "email": "john.doe@example.com",
  "taxId": "123-45-6789",
  "investments": []
}
```


### PUT https://api.example.com/api/persons/{id}
Updates a person by their ID.
Request:



```json
{
  "fullName": "Johnathan Doe",
  "email": "john.doe@example.com",
  "taxId": "123-45-6789"
}
```

Response:



```json
{
  "id": 1,
  "fullName": "Johnathan Doe",
  "email": "john.doe@example.com",
  "taxId": "123-45-6789",
  "investments": []
}
```


### DELETE https://api.example.com/api/persons/{id}
Deletes a person by their ID.
Request:



```json
{}
```

Response:



```json
{}
```