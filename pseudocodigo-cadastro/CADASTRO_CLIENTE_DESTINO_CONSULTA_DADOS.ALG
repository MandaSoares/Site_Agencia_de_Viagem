Algoritmo "Cadastro_Cliente_Destino_Consulta_Dados"

Var
   cpf: vetor [1..10] de inteiro
   nome: vetor [1..10] de caractere
   email: vetor [1..10] de caractere
   cel_tel: vetor [1..10] de inteiro
   est: vetor [1..10] de caractere
   cid: vetor [1..10] de caractere
   end: vetor [1..10] de caractere
   cep: vetor [1..10] de inteiro
   tipo_serv: vetor [1..10] de caractere
   viagem: vetor [1..10] de caractere
   cpf_consul: inteiro
   i:inteiro
   encontrado: logico


Inicio
   escreval("--------------  CADASTRO DADOS PESSOAIS --------------")
   para i de 1 ate 2 faca
      escreva ("Digite seu CPF: ")
      leia (cpf[i])
      escreva ("Digite seu Nome: ")
      leia (nome[i])
      escreva ("Digite seu Email: ")
      leia (email[i])
      escreva ("Digite seu Celular/Telefone: ")
      leia (cel_tel[i])
      escreva ("Digite seu Estado: ")
      leia (est[i])
      escreva ("Digite sua Cidade: ")
      leia (cid[i])
      escreva ("Digite seu Endereço: ")
      leia (end[i])
      escreva ("Digite seu CEP: ")
      leia (cep[i])
      escreval("------------------  CADASTRO DESTINO ------------------")
      escreva ("Digite o Tipo de Serviço: ")
      leia (tipo_serv[i])
      escreva ("Digite a Viagem(se necessário): ")
      leia (viagem[i])
      Escreval("Cadastro Feito Com Sucesso!")
   fimpara

   escreval("-----------------  CADASTRO CONSULTA ------------------")

   Escreval("Escreva o CPF que você deseja consultar: " )
   leia(cpf_consul)

   para i de 1 ate 2 faca
      se cpf[i] = cpf_consul entao
         escreval("Cadastro Encontrado")
         escreval ("CPF: ", cpf[i])
         escreval ("Nome: ", nome[i])
         escreval ("Email: ", email[i])
         escreval ("Celular/Telefone: ", cel_tel[i])
         escreval ("Estado: ", est[i])
         escreval ("Cidade: ", cid[i])
         escreval ("Endereço: ", end[i])
         escreval ("CEP: ", cep[i])
         escreval ("Tipo de Serviço: ", tipo_serv[i])
         escreval ("Viagem: ", viagem[i])
         encontrado <- verdadeiro
      fimse
   fimpara
   se encontrado = falso entao
      Escreval("Cadastro Não Encontrado!")
   fimse


Fimalgoritmo