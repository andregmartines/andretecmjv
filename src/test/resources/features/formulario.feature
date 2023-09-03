#language: pt
#encoding: utf-8
#Author: andregmartines@gmail.com


@Regressivo @CT01
Funcionalidade: Preenchimento de formulário MJV

Cenario: preenchendo formulario com sucesso
  Dado que estou na página "https://automationteststore.com/index.php?rt=account/create"
  Quando preencho o formulário para cadastro
  E valido mensagem "YOUR ACCOUNT HAS BEEN CREATED!" depois clico no botão continuar
  Então verifico se o usuário está logado