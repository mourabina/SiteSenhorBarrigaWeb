#language: pt
#Author: Hilario Bina
#Version: 1.0
#Encoding: UTF-8
@CadastrarUsuario
Funcionalidade: Cadatrar Usuario

  @TesteUsuario01 @webSenhorBarriga
  Cenario: 01 - validar criacao novo usuario
    Dado que estou no site do Senhor Barriga
    E estou executando o teste
      | id | Numero do CT | Nome do CT                   | Nome do executor | Sprint |
      |  1 | Usuario - 01 | validar criacao novo usuario | Hilario Bina     | T1     |
    E clico no item do menu Novo Usuario"
    E preencho os campos "nome", "email" e "senha" com os valores validos
    Quando clico no botao Cadastrar
    Entao deve ser apresentado a mensagem "Usuário inserido com sucesso" na tela de Novo Usuario

  @TesteUsuario02 @webSenhorBarriga
  Cenario: 02 - validar obrigatoriedade do campo Nome
    Dado que estou no site do Senhor Barriga
    E estou executando o teste
      | id | Numero do CT | Nome do CT                            | Nome do executor | Sprint |
      |  2 | Usuario - 02 | validar obrigatoriedade do campo Nome | Hilario Bina     | T1     |
    E clico no item do menu Novo Usuario"
    E preencho somente os campos "email" e "senha" com os valores "moura@moura" e "1234"
    Quando clico no botao Cadastrar
    Entao deve ser apresentado a mensagem "Nome é um campo obrigatório" na tela

  @TesteUsuario03 @webSenhorBarriga
  Cenario: 03 - validar obrigatoriedade do campo 'Email'
    Dado que estou no site do Senhor Barriga
    E estou executando o teste
      | id | Numero do CT | Nome do CT                               | Nome do executor | Sprint |
      |  3 | Usuario - 03 | validar obrigatoriedade do campo 'Email' | Hilario Bina     | T1     |
    E clico no item do menu Novo Usuario"
    E preencho somente os campos "nome" e "senha" com os valores "moura" e "1234"
    Quando clico no botao Cadastrar
    Entao deve ser apresentado a mensagem "Email é um campo obrigatório" na tela
