@echo off
cls
echo ----------------------------------------
echo        Trabalho Micro Serviços
echo ----------------------------------------
echo
echo

echo ----------------------------------------
echo        Eureka Porta: 8761

@echo off 
start java -jar unialfa-eureka-api.jar
start java -jar cliente-api.jar
start java -jar hotel-api.jar
start java -jar reserva-voo-api.jar
start java -jar ApiPagamento.jar

cd reserva-carro

start UI.WebApi.exe


cd ..\publish

start Sqit.ApiGateway.exe

pause
