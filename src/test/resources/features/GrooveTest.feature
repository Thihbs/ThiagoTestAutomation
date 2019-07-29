#language : pt

Funcionalidade: Testar o Cadastro da AutomationPractice

  @Automation
 Esquema do Cenario: Acessar e Preencher o Cadastro da pagina Automationpractice
    Dado que eu acessei a home page da Automationpractice
    Quando eu clicar na opção de menu “SignIn” e preencher o email com <Email>
    E preencher os campos sexo com <sexo>. ,nome com <nome>,Sobrenome <sobrenome>,e senha <senha>
    E o campo dia com <dia> ,o mes com <mes> e o ano com <ano>
    E o campo compania com Teste ,endereco com Rua Jabaquara,cidade Vargem,estado Texas
    E o campo zip com <code>,informacao <info>,telefone <tel>,celular <cel>,email <emailAlt>
    E clicar no botão Registrar
    Então validar que o cadastro sera feito com sucesso e feito o login

    Exemplos: 
    
    |Email             |sexo |nome   |sobrenome|senha  |dia|mes|ano |code |info    |tel     |cel      |emailAlt                     | 
    |testando@gmail.com|Mr   |Thiago |Henrique |1234567|23 |2  |1996|56435|TESTE   |41591096|973346931|testandoALternativo@gmail.com|  
   