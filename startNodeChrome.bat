cd C:\Selenium
java -jar .\selenium-server-standalone-2.38.0.jar -role node -port 8992 -hub http://localhost:4444/grid/register -browser "browserName=chrome,maxInstances=25,platform=ANY"