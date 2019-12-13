#language: pt
#Author: Hilario Bina
#Version: 1.0
#Encoding: UTF-8
@LoginSenhorBarriga
Funcionalidade: Login SR Barriga

  @Teste01 @webSenhorBarriga
  Cenario: 01 - Validar acesso a tela de Login do Site do Senhor Barriga
    Dado que estou no site do Senhor Barriga
    E estou executando o teste
      | id | Numero do CT | Nome do CT                                               | Nome do executor | Sprint |
      |  1 | Teste - 01   | Validar acesso a tela de Login do Site do Senhor Barriga | Hilario Bina     | T1     |
    E digito o usuario "bina@bina" e Senha "bina"
    Quando clico no botao Entrar
    Entao deve ser apresentado a mensagem "Bem vindo, bina!"

  @Teste02 @webSenhorBarriga
  Cenario: 02 - Validar Obrigatoriedade do Campo Email
    Dado que estou no site do Senhor Barriga
    E estou executando o teste
      | id | Numero do CT | Nome do CT                             | Nome do executor | Sprint |
      |  2 | Teste - 02   | Validar Obrigatoriedade do Campo Email | Hilario Bina     | T1     |
    E preencho somente o campo senha com o valor "bina"
    E clico no botao Entrar
    Entao deve ser apresentado a mensagem "Email é um campo obrigatório" na tela de login

  @Teste03 @webSenhorBarriga
  Cenario: 03 - Validar Obrigatoriedade do Campo Senha
    Dado que estou no site do Senhor Barriga
    E estou executando o teste
      | id | Numero do CT | Nome do CT                             | Nome do executor | Sprint |
      |  3 | Teste - 03   | Validar Obrigatoriedade do Campo Email | Hilario Bina     | T1     |
    E preencho somente o campo Email com o valor "bina@bina"
    Quando clico no botao Entrar
    Entao deve ser apresentado a mensagem "Senha é um campo obrigatório" na tela de login

  @Teste04 @webSenhorBarriga
  Cenario: 04 - Valdiar Click no botão Entrar sem preencher nenhum campo
    Dado que estou no site do Senhor Barriga
    E estou executando o teste
      | id | Numero do CT | Nome do CT                                               | Nome do executor | Sprint |
      |  4 | Teste - 04   | Valdiar Click no botão Entrar sem preencher nenhum campo | Hilario Bina     | T1     |
    Quando clico no botao Entrar
    Entao deve ser apresentado as mensagens "Email é um campo obrigatório" e "Senha é um campo obrigatório"
