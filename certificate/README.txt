How to generate a SSL certificate and keystore

1. generate private key

openssl genrsa -out privkey.pem 2048

2. generate a SSL certificate based on the private key

openssl req -new -x509 -key privkey.pem -out cacert.pem -days 365

3. generate keystore based on the SLL certificate

keytool -import -file cacert.pem -keystore cacert.key

keysotre password: ECSE489