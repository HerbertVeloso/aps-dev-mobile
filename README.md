# APS1 de Desenvolvimento de Aplicações Móveis

**Professor:** Marcelo Perantoni 
**Turma:** 963
**Alunos:** 
Daniel de Almeida Porréca – 2015100890
Herbert Veloso - 2017200392
Jeferson Adriano da Silva - 2020100071
Vitor Santos Lobo - 2018100762

## Introdução:
Nesta atividade temos o objetivo de desenvolver uma aplicação para dispositivos móveis Android que atende uma finalidade prática. 

## Caso de Uso: 
##### Lançador de Dados para jogos de Representação (RPG).

Umas das atividades lúdicas mais socialmente praticadas são jogos de mesa: cartas, jogos de tabuleiros e entres estes jogos, jogos de representação ou RPGs (Role-Playing Games). Neste tipo de jogo, os jogadores contam estórias com personagens dessas estórias, onde planilhas de personagens determinam as competências desses personagens e quando estes personagens executam algumas atividades, o êxito ou fracasso dessas atividades são determinados por lançamento de dados especiais chamados decaedros (ou dados de 10 lados, D10). Porém, com o advento da Pandemia e o necessário distanciamento social, compartilhar objetos ou reuniões presenciais não são mais viáveis. Portanto o objetivo da aplicação é emular o lançamento de um ou mais dados, filtrando valores maiores que 7, que é o fator de acerto de sucesso do personagem em uma determinada ação.
  
## Levantamento de Requisitos:
- Gerar dados números valorados de 1 a 10 que reproduzem o lançamento de um dado.
- Permitir o lançamento de um ou mais desses dados, exibindo os resultados de um determinado lançamento.
- Contabilizar o número de acertos. (valores acima de 7 obtidos em um lançamento)

## Detalhes da Aplicação:
	
**Para esta finalidade criamos um aplicativo com estas especificações:**
- [x] Campos textuais que exibirão orientações e os resultados dos processos.
- [x] Campo textual que indica a quantidade de dados que serão lançados.
- [x] Botões que adicionam ou retiram dados a serem jogados. 
(Nota: restringimos o número mínimo de dados a somente 1 dado e máximo de 5 dados)
- [x] Botão Jogar que efetivamente executa o processo a partir do número determinado de dados a serem lançados.
- [x] Botão Limpar que retorna à condição inicial de somente um dado e limpa qualquer resultado já registrado em tela.
