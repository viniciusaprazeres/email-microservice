# Email Microservice <br> [![status](https://img.shields.io/badge/Status%20-Em%20Desenvolvimento-39E09B?style=flat)]()

Este repositório contém um microsserviço de envio de emails desenvolvido em **Java** e **Spring Boot** com suporte a mensageria usando RabbitMQ.
<br><br>

## Funcionalidades
Envio de emails de forma assíncrona.
<br><br>

## Implementações Futuras
- Suporte para envio em massa.
- Personalização de templates de email.
- Gerenciamento de filas de envio.
<br><br>

## Pré-requisitos
* Java 17
* Spring Boot 3
* Maven
<br><br>

## Uso
O microsserviço expõe uma API REST para o envio de emails. Você pode enviar um email fazendo uma requisição POST para a seguinte rota: `http://localhost:8080/sending-email` <br><br>

O corpo da requisição deve conter os seguintes parâmetros (JSON): <br>
```
{
    "ownerReference": "Nome do proprietário",
    "emailFrom": "remetente@email.com",
    "emailTo": "destinatario@email.com",
    "subject": "Assunto do e-mail",
    "text": "Texto do e-mail."
}
```
<br>

## Contribuição
Contribuições são bem-vindas! Se você tiver alguma melhoria, correção de bugs ou novas funcionalidades, sinta-se à vontade para abrir uma issue ou enviar um pull request.
<br><br>

## Licença
Este projeto está licenciado sob a licença **MIT**. Acesse [The MIT License](https://opensource.org/license/mit/) para obter mais informações.
