# Flask API Guide

## Prerequisites
- **Python** (`python --version` or `python3 --version`)
- **Flask** (`pip install flask`)

## Setup

1. Save `api.py` in a folder.
2. Install Flask:
   ```sh
   pip install flask
   ```
3. Run the API:
   ```sh
   python api.py
   ```
   or
   ```sh
   python3 api.py
   ```

## Endpoints

| Endpoint  | Method | Description |
|-----------|--------|-------------|
| `/os`     | GET    | OS name |
| `/version` | GET   | OS version |
| `/ip`     | GET    | Requestor's IP |
| `/all`    | GET    | OS name, version, and IP |

## Testing

### Browser
Visit:
- `http://127.0.0.1:5000/os`
- `http://127.0.0.1:5000/version`
- `http://127.0.0.1:5000/ip`
- `http://127.0.0.1:5000/all`

### cURL
```sh
curl http://127.0.0.1:5000/os
curl http://127.0.0.1:5000/version
curl http://127.0.0.1:5000/ip
curl http://127.0.0.1:5000/all
```

### Postman
1. Open **Postman**
2. Select **GET**
3. Enter an endpoint (e.g., `http://127.0.0.1:5000/os`)
4. Click **Send**

## Stop the API
Press **CTRL + C**.
