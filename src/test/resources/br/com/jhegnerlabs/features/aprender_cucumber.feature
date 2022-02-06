# language: pt
@esse
Funcionalidade: Aprender Cucumber
  Como um desenvolvedor
  Eu quero aprender a utilizar o Cucumber
  Para que eu possa automatizar critérios de aceitação

  Cenario: Deve executar especificação
    Dado que criei o arquivo corretamente
    Quando executá-lo
    Entao a especificação deve finalizar com sucesso

  Cenario: Deve incrementar contador
    Dado que o valor do contador é 15
    Quando eu incrementar em 5
    Entao o valor do contador sera 20

  Cenario: Deve calcular atraso na entrega
    Dado que a entrega é dia 05/02/2022
    Quando a entrega atrasar em 2 dias
    Entao a entrega será efetuada em 07/02/2022

#  @esse
  Cenario: Deve calcular atraso na entrega da china
    Dado que a entrega é dia 05/02/2022
    Quando a entrega atrasar em 2 meses
    Entao a entrega será efetuada em 05/04/2022

  Cenário: Deve criar steps genéricos para estes passos
    Dado que o ticket é AF345
    E que o valor da passagem é R$ 230,45
    E que o nome do passageiro é "Fulano da Silva"
    E que o telefone do passageiro é 9999-9999
    Quando criar os steps
    Entao o teste vai funcionar

  Cenário: Deve reaproveitar os steps "Dado" do cenário anterior
    Dado que o ticket é AB167
    Dado que o ticket especial é AB167
    Dado que o valor da passagem é R$ 1120,23
    Dado que o nome do passageiro é "Cicrano de Oliveira"
    Dado que o telefone do passageiro é 9888-8888

#  @ignore
#  Cenário: Deve negar todos os steps "Dado" dos cenários anteriores
#    Dado que o ticket é AD123AA
#    Dado que o ticket é AG1234
#    Dado que o valor da passagem é R$ 1.1345,56
#    Dado que o nome do passageiro é "Beltrano Souza Matos de Alcântara Azevedo"
#    Dado que o telefone do passageiro é 1234-5678
#    Dado que o telefone do passageiro é 999-2223