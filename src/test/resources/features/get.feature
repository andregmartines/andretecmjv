#language: pt
#encoding: utf-8
#Author: andregmartines@gmail.com


@Regressivo @CT02
Funcionalidade: Validação de campos em resposta de get

Cenario: enviar get para API
  Dado que envio um get para o endpoint "https://api.trello.com/1/actions/592f11060f95a3d3d46a987a"
  Quando recebo a resposta da API
  Então valido o status code 200
  E valido o conteúdo do campo name "Professional"