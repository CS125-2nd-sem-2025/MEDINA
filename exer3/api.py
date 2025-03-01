from flask import Flask, request, jsonify
import platform
import socket

api = Flask(__name__)

def get_ip_address():
    host = socket.gethostname()
    return socket.gethostbyname(host)

@api.route('/os', methods=['GET'])
def get_os_name():
    return jsonify({"os_name": platform.system()})

@api.route('/version', methods=['GET'])
def get_os_version():
    return jsonify({"os_version": platform.version()})

@api.route('/ip', methods=['GET'])
def get_client_ip():
    return jsonify({"client_ip": request.remote_addr})

@api.route('/all', methods=['GET'])
def get_all():
    return jsonify({
        "operating_system": platform.system(),
        "os_version": platform.version(),
        "client_ip": request.remote_addr
    })

if __name__ == '__main__':
    api.run(host='0.0.0.0', port=5000, debug=True)