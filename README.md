# RecipeApp
Spring CRUD app made during Hyperskill Jetbrains Java Backend Developer Course


<!-- Generator: Widdershins v4.0.1 -->

<h1 id="openapi-definition">OpenAPI definition v1</h1>

> Scroll down for code samples, example requests and responses. Select a language for code samples from the tabs above or the mobile navigation menu.

Base URLs:

* <a href="http://localhost:8881/">http://localhost:8881/</a>

<h1 id="openapi-definition-recipe-controller">recipe-controller</h1>

## getRecipe

<a id="opIdgetRecipe"></a>

> Code samples

```shell
# You can also use wget
curl -X GET http://localhost:8881/api/recipe/{id} \
  -H 'Accept: */*'

```

```http
GET http://localhost:8881/api/recipe/{id} HTTP/1.1
Host: localhost:8881
Accept: */*

```

```javascript

const headers = {
  'Accept':'*/*'
};

fetch('http://localhost:8881/api/recipe/{id}',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => '*/*'
}

result = RestClient.get 'http://localhost:8881/api/recipe/{id}',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': '*/*'
}

r = requests.get('http://localhost:8881/api/recipe/{id}', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','http://localhost:8881/api/recipe/{id}', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8881/api/recipe/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "http://localhost:8881/api/recipe/{id}", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`GET /api/recipe/{id}`

<h3 id="getrecipe-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|integer(int64)|true|none|

> Example responses

> 200 Response

<h3 id="getrecipe-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|[Recipe](#schemarecipe)|

<aside class="success">
This operation does not require authentication
</aside>

## updateRecipe

<a id="opIdupdateRecipe"></a>

> Code samples

```shell
# You can also use wget
curl -X PUT http://localhost:8881/api/recipe/{id} \
  -H 'Content-Type: application/json' \
  -H 'Accept: */*'

```

```http
PUT http://localhost:8881/api/recipe/{id} HTTP/1.1
Host: localhost:8881
Content-Type: application/json
Accept: */*

```

```javascript
const inputBody = '{
  "recipe": {
    "name": "string",
    "description": "string",
    "ingredients": [
      "string"
    ],
    "directions": [
      "string"
    ],
    "category": "string",
    "date": "2019-08-24T14:15:22Z"
  },
  "details": {
    "username": "string",
    "password": "string",
    "enabled": true,
    "authorities": [
      {
        "authority": "string"
      }
    ],
    "accountNonLocked": true,
    "credentialsNonExpired": true,
    "accountNonExpired": true
  }
}';
const headers = {
  'Content-Type':'application/json',
  'Accept':'*/*'
};

fetch('http://localhost:8881/api/recipe/{id}',
{
  method: 'PUT',
  body: inputBody,
  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Content-Type' => 'application/json',
  'Accept' => '*/*'
}

result = RestClient.put 'http://localhost:8881/api/recipe/{id}',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Content-Type': 'application/json',
  'Accept': '*/*'
}

r = requests.put('http://localhost:8881/api/recipe/{id}', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Content-Type' => 'application/json',
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('PUT','http://localhost:8881/api/recipe/{id}', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8881/api/recipe/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("PUT");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Content-Type": []string{"application/json"},
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("PUT", "http://localhost:8881/api/recipe/{id}", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`PUT /api/recipe/{id}`

> Body parameter

```json
{
  "recipe": {
    "name": "string",
    "description": "string",
    "ingredients": [
      "string"
    ],
    "directions": [
      "string"
    ],
    "category": "string",
    "date": "2019-08-24T14:15:22Z"
  },
  "details": {
    "username": "string",
    "password": "string",
    "enabled": true,
    "authorities": [
      {
        "authority": "string"
      }
    ],
    "accountNonLocked": true,
    "credentialsNonExpired": true,
    "accountNonExpired": true
  }
}
```

<h3 id="updaterecipe-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|integer(int64)|true|none|
|body|body|object|true|none|
|» recipe|body|[Recipe](#schemarecipe)|false|none|
|»» name|body|string|true|none|
|»» description|body|string|true|none|
|»» ingredients|body|[string]|true|none|
|»» directions|body|[string]|true|none|
|»» category|body|string|true|none|
|»» date|body|string(date-time)|false|none|
|» details|body|[UserDetailsImpl](#schemauserdetailsimpl)|false|none|
|»» username|body|string|false|none|
|»» password|body|string|false|none|
|»» enabled|body|boolean|false|none|
|»» authorities|body|[[GrantedAuthority](#schemagrantedauthority)]|false|none|
|»»» authority|body|string|false|none|
|»» accountNonLocked|body|boolean|false|none|
|»» credentialsNonExpired|body|boolean|false|none|
|»» accountNonExpired|body|boolean|false|none|

> Example responses

> 200 Response

<h3 id="updaterecipe-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|string|

<aside class="success">
This operation does not require authentication
</aside>

## deleteRecipe

<a id="opIddeleteRecipe"></a>

> Code samples

```shell
# You can also use wget
curl -X DELETE http://localhost:8881/api/recipe/{id} \
  -H 'Content-Type: application/json' \
  -H 'Accept: */*'

```

```http
DELETE http://localhost:8881/api/recipe/{id} HTTP/1.1
Host: localhost:8881
Content-Type: application/json
Accept: */*

```

```javascript
const inputBody = '{
  "username": "string",
  "password": "string",
  "enabled": true,
  "authorities": [
    {
      "authority": "string"
    }
  ],
  "accountNonLocked": true,
  "credentialsNonExpired": true,
  "accountNonExpired": true
}';
const headers = {
  'Content-Type':'application/json',
  'Accept':'*/*'
};

fetch('http://localhost:8881/api/recipe/{id}',
{
  method: 'DELETE',
  body: inputBody,
  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Content-Type' => 'application/json',
  'Accept' => '*/*'
}

result = RestClient.delete 'http://localhost:8881/api/recipe/{id}',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Content-Type': 'application/json',
  'Accept': '*/*'
}

r = requests.delete('http://localhost:8881/api/recipe/{id}', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Content-Type' => 'application/json',
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('DELETE','http://localhost:8881/api/recipe/{id}', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8881/api/recipe/{id}");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("DELETE");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Content-Type": []string{"application/json"},
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("DELETE", "http://localhost:8881/api/recipe/{id}", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`DELETE /api/recipe/{id}`

> Body parameter

```json
{
  "username": "string",
  "password": "string",
  "enabled": true,
  "authorities": [
    {
      "authority": "string"
    }
  ],
  "accountNonLocked": true,
  "credentialsNonExpired": true,
  "accountNonExpired": true
}
```

<h3 id="deleterecipe-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|id|path|integer(int64)|true|none|
|body|body|[UserDetailsImpl](#schemauserdetailsimpl)|false|none|

> Example responses

> 200 Response

<h3 id="deleterecipe-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|string|

<aside class="success">
This operation does not require authentication
</aside>

## saveRecipe

<a id="opIdsaveRecipe"></a>

> Code samples

```shell
# You can also use wget
curl -X POST http://localhost:8881/api/recipe/new \
  -H 'Content-Type: application/json' \
  -H 'Accept: */*'

```

```http
POST http://localhost:8881/api/recipe/new HTTP/1.1
Host: localhost:8881
Content-Type: application/json
Accept: */*

```

```javascript
const inputBody = '{
  "recipe": {
    "name": "string",
    "description": "string",
    "ingredients": [
      "string"
    ],
    "directions": [
      "string"
    ],
    "category": "string",
    "date": "2019-08-24T14:15:22Z"
  },
  "details": {
    "username": "string",
    "password": "string",
    "enabled": true,
    "authorities": [
      {
        "authority": "string"
      }
    ],
    "accountNonLocked": true,
    "credentialsNonExpired": true,
    "accountNonExpired": true
  }
}';
const headers = {
  'Content-Type':'application/json',
  'Accept':'*/*'
};

fetch('http://localhost:8881/api/recipe/new',
{
  method: 'POST',
  body: inputBody,
  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Content-Type' => 'application/json',
  'Accept' => '*/*'
}

result = RestClient.post 'http://localhost:8881/api/recipe/new',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Content-Type': 'application/json',
  'Accept': '*/*'
}

r = requests.post('http://localhost:8881/api/recipe/new', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Content-Type' => 'application/json',
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('POST','http://localhost:8881/api/recipe/new', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8881/api/recipe/new");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("POST");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Content-Type": []string{"application/json"},
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("POST", "http://localhost:8881/api/recipe/new", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`POST /api/recipe/new`

> Body parameter

```json
{
  "recipe": {
    "name": "string",
    "description": "string",
    "ingredients": [
      "string"
    ],
    "directions": [
      "string"
    ],
    "category": "string",
    "date": "2019-08-24T14:15:22Z"
  },
  "details": {
    "username": "string",
    "password": "string",
    "enabled": true,
    "authorities": [
      {
        "authority": "string"
      }
    ],
    "accountNonLocked": true,
    "credentialsNonExpired": true,
    "accountNonExpired": true
  }
}
```

<h3 id="saverecipe-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|object|true|none|
|» recipe|body|[Recipe](#schemarecipe)|false|none|
|»» name|body|string|true|none|
|»» description|body|string|true|none|
|»» ingredients|body|[string]|true|none|
|»» directions|body|[string]|true|none|
|»» category|body|string|true|none|
|»» date|body|string(date-time)|false|none|
|» details|body|[UserDetailsImpl](#schemauserdetailsimpl)|false|none|
|»» username|body|string|false|none|
|»» password|body|string|false|none|
|»» enabled|body|boolean|false|none|
|»» authorities|body|[[GrantedAuthority](#schemagrantedauthority)]|false|none|
|»»» authority|body|string|false|none|
|»» accountNonLocked|body|boolean|false|none|
|»» credentialsNonExpired|body|boolean|false|none|
|»» accountNonExpired|body|boolean|false|none|

> Example responses

> 200 Response

<h3 id="saverecipe-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|Inline|

<h3 id="saverecipe-responseschema">Response Schema</h3>

Status Code **200**

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|» **additionalProperties**|integer(int64)|false|none|none|

<aside class="success">
This operation does not require authentication
</aside>

## searchRecipes

<a id="opIdsearchRecipes"></a>

> Code samples

```shell
# You can also use wget
curl -X GET http://localhost:8881/api/recipe/search \
  -H 'Accept: */*'

```

```http
GET http://localhost:8881/api/recipe/search HTTP/1.1
Host: localhost:8881
Accept: */*

```

```javascript

const headers = {
  'Accept':'*/*'
};

fetch('http://localhost:8881/api/recipe/search',
{
  method: 'GET',

  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Accept' => '*/*'
}

result = RestClient.get 'http://localhost:8881/api/recipe/search',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Accept': '*/*'
}

r = requests.get('http://localhost:8881/api/recipe/search', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('GET','http://localhost:8881/api/recipe/search', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8881/api/recipe/search");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("GET");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("GET", "http://localhost:8881/api/recipe/search", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`GET /api/recipe/search`

<h3 id="searchrecipes-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|category|query|string|false|none|
|name|query|string|false|none|

> Example responses

> 200 Response

<h3 id="searchrecipes-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|Inline|

<h3 id="searchrecipes-responseschema">Response Schema</h3>

Status Code **200**

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|*anonymous*|[[Recipe](#schemarecipe)]|false|none|none|
|» name|string|true|none|none|
|» description|string|true|none|none|
|» ingredients|[string]|true|none|none|
|» directions|[string]|true|none|none|
|» category|string|true|none|none|
|» date|string(date-time)|false|none|none|

<aside class="success">
This operation does not require authentication
</aside>

<h1 id="openapi-definition-user-controller">user-controller</h1>

## registerUser

<a id="opIdregisterUser"></a>

> Code samples

```shell
# You can also use wget
curl -X POST http://localhost:8881/api/register \
  -H 'Content-Type: application/json' \
  -H 'Accept: */*'

```

```http
POST http://localhost:8881/api/register HTTP/1.1
Host: localhost:8881
Content-Type: application/json
Accept: */*

```

```javascript
const inputBody = '{
  "email": "string",
  "password": "stringst"
}';
const headers = {
  'Content-Type':'application/json',
  'Accept':'*/*'
};

fetch('http://localhost:8881/api/register',
{
  method: 'POST',
  body: inputBody,
  headers: headers
})
.then(function(res) {
    return res.json();
}).then(function(body) {
    console.log(body);
});

```

```ruby
require 'rest-client'
require 'json'

headers = {
  'Content-Type' => 'application/json',
  'Accept' => '*/*'
}

result = RestClient.post 'http://localhost:8881/api/register',
  params: {
  }, headers: headers

p JSON.parse(result)

```

```python
import requests
headers = {
  'Content-Type': 'application/json',
  'Accept': '*/*'
}

r = requests.post('http://localhost:8881/api/register', headers = headers)

print(r.json())

```

```php
<?php

require 'vendor/autoload.php';

$headers = array(
    'Content-Type' => 'application/json',
    'Accept' => '*/*',
);

$client = new \GuzzleHttp\Client();

// Define array of request body.
$request_body = array();

try {
    $response = $client->request('POST','http://localhost:8881/api/register', array(
        'headers' => $headers,
        'json' => $request_body,
       )
    );
    print_r($response->getBody()->getContents());
 }
 catch (\GuzzleHttp\Exception\BadResponseException $e) {
    // handle exception or api errors.
    print_r($e->getMessage());
 }

 // ...

```

```java
URL obj = new URL("http://localhost:8881/api/register");
HttpURLConnection con = (HttpURLConnection) obj.openConnection();
con.setRequestMethod("POST");
int responseCode = con.getResponseCode();
BufferedReader in = new BufferedReader(
    new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer response = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    response.append(inputLine);
}
in.close();
System.out.println(response.toString());

```

```go
package main

import (
       "bytes"
       "net/http"
)

func main() {

    headers := map[string][]string{
        "Content-Type": []string{"application/json"},
        "Accept": []string{"*/*"},
    }

    data := bytes.NewBuffer([]byte{jsonReq})
    req, err := http.NewRequest("POST", "http://localhost:8881/api/register", data)
    req.Header = headers

    client := &http.Client{}
    resp, err := client.Do(req)
    // ...
}

```

`POST /api/register`

> Body parameter

```json
{
  "email": "string",
  "password": "stringst"
}
```

<h3 id="registeruser-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[User](#schemauser)|true|none|

> Example responses

> 200 Response

<h3 id="registeruser-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|OK|string|

<aside class="success">
This operation does not require authentication
</aside>

# Schemas

<h2 id="tocS_Recipe">Recipe</h2>
<!-- backwards compatibility -->
<a id="schemarecipe"></a>
<a id="schema_Recipe"></a>
<a id="tocSrecipe"></a>
<a id="tocsrecipe"></a>

```json
{
  "name": "string",
  "description": "string",
  "ingredients": [
    "string"
  ],
  "directions": [
    "string"
  ],
  "category": "string",
  "date": "2019-08-24T14:15:22Z"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|name|string|true|none|none|
|description|string|true|none|none|
|ingredients|[string]|true|none|none|
|directions|[string]|true|none|none|
|category|string|true|none|none|
|date|string(date-time)|false|none|none|

<h2 id="tocS_GrantedAuthority">GrantedAuthority</h2>
<!-- backwards compatibility -->
<a id="schemagrantedauthority"></a>
<a id="schema_GrantedAuthority"></a>
<a id="tocSgrantedauthority"></a>
<a id="tocsgrantedauthority"></a>

```json
{
  "authority": "string"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|authority|string|false|none|none|

<h2 id="tocS_UserDetailsImpl">UserDetailsImpl</h2>
<!-- backwards compatibility -->
<a id="schemauserdetailsimpl"></a>
<a id="schema_UserDetailsImpl"></a>
<a id="tocSuserdetailsimpl"></a>
<a id="tocsuserdetailsimpl"></a>

```json
{
  "username": "string",
  "password": "string",
  "enabled": true,
  "authorities": [
    {
      "authority": "string"
    }
  ],
  "accountNonLocked": true,
  "credentialsNonExpired": true,
  "accountNonExpired": true
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|username|string|false|none|none|
|password|string|false|none|none|
|enabled|boolean|false|none|none|
|authorities|[[GrantedAuthority](#schemagrantedauthority)]|false|none|none|
|accountNonLocked|boolean|false|none|none|
|credentialsNonExpired|boolean|false|none|none|
|accountNonExpired|boolean|false|none|none|

<h2 id="tocS_User">User</h2>
<!-- backwards compatibility -->
<a id="schemauser"></a>
<a id="schema_User"></a>
<a id="tocSuser"></a>
<a id="tocsuser"></a>

```json
{
  "email": "string",
  "password": "stringst"
}

```

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|email|string|true|none|none|
|password|string|true|none|none|

