cd C:\Selenium
java -jar .\selenium-server-standalone-2.38.0.jar -role node -port 8993 -browser "browserName=firefox,maxInstances=25,platform=ANY" -hub http://localhost:4444/grid/register
