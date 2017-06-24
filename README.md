# What is this?
Sample SpringBoot application with OAuth2 based authorization.

# How to use?
#### Boot run application
```bash
./gradlew clean bootRun
```

#### Get access token with password
```bash
curl -XPOST -vu app:secret "http://localhost:9000/server/oauth/token?username=admin&password=admin&grant_type=password"
```

Response:

```bash
{
    "access_token":"aa1dbe69-b03a-4517-966f-a9bd5e0e4747",
    "token_type":"bearer",
    "refresh_token":"89472ee5-01b1-400b-8fcf-413cf52df7f4",
    "expires_in":1799,
    "scope":"read write"
}
```

#### Get access token with refresh token
```bash
curl -XPOST -vu app:secret "http://localhost:9000/server/oauth/token?refresh_token=89472ee5-01b1-400b-8fcf-413cf52df7f4&grant_type=refresh_token"
```

Response:

```bash
{
    "access_token":"262f25ab-943e-4014-b254-542acc808d22",
    "token_type":"bearer",
    "refresh_token":"89472ee5-01b1-400b-8fcf-413cf52df7f4",
    "expires_in":1799,
    "scope":"read write"
}
```

#### Access unsecured resources
```bash
curl -XGET http://localhost:9000/server/unsecured
```

Response:

```bash
Just public stuff
```

#### Access secured resources
```bash
curl -XGET http://localhost:9000/server/secured
```

Response:

```bash
{
    "timestamp":1498298747485,
    "status":401,
    "error":"Unauthorized",
    "message":"Access Denied",
    "path":"/server/secured"
}
```

Get access_token

```bash
curl -XPOST -vu app:secret "http://localhost:9000/server/oauth/token?username=admin&password=admin&grant_type=password"
```

Response:

```bash
{
    "access_token":"2782cbd7-852c-41f1-9477-7e2a78e6fe38",
    "token_type":"bearer",
    "refresh_token":"89f7bf5a-720b-42e8-8b47-a80222a4fbdd",
    "expires_in":1799,
    "scope":"read write"
}
```

Request resource with Authorization header

```bash
curl -XGET -H "Authorization: Bearer 2782cbd7-852c-41f1-9477-7e2a78e6fe38" http://localhost:9000/server/secured
```

Response:

```bash
Secret stuff
```