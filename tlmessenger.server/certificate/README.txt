How to generate a SSL certificate and keystore

1. generate private key

openssl genrsa -out privkey.pem 2048

2. generate a SSL certificate based on the private key

openssl req -new -x509 -key privkey.pem -out cacert.pem -days 365

3. generate keystore based on the SLL certificate

keytool -importcert -alias selfsigned -keystore cacert.jks -storepass ECSE489 -file cacert.pem -trustcacerts

or:

Recommended:

keytool -genkey -keyalg RSA -alias selfsigned -keystore keystore.jks -storepass ECSE489 -validity 365 -keysize 2048
