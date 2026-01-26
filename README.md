## 👤 Autor
Augusto Henrique (Guttester)

## Google-Automatizado

Protótipo estrutural de projeto de automação de testes, voltado para estudo, organização de arquitetura e validação de fluxos no Google. Foco em boas práticas, padronização de código e construção de uma base reutilizável para projetos futuros.

## Observação

O projeto é constituído por testes automatizados, utilizando Cypress e Selenium.  
Os cenários de validação implementados foram os seguintes:

- ✅ CT.01 - Validar acesso com o link "www.google.com". 
- ✅ CT.02 - Validar pesquisa no campo de busca do google.
- ✅ CT.03 - Validar pesquisa no campo de busca do google imagens.
- ✅ CT.04 - Validar listagem de aplicativos google após clique.
- ✅ CT.05 - Validar acesso de aplicativo do youtube após o clique do incone.
- ✅ CT.06 - Validar acesso de aplicativo do Drive após o clique do incone.  
- ✅ CT.07 - Validar acesso de aplicativo do Gmail após o clique do incone.
- ✅ CT.08 - Validar acesso de aplicativo do Maps após o clique do incone.
- ✅ CT.09 - Validar clique no button fazer login.
- ⚠️ CT.10 - Validar mensagem de erro com login inválido.
- ✅ CT.11 - Validar acesso de termos do Google.
- ✅ CT.12 - Validar clique no primeiro bloco "As pessoas também perguntam"

Para configurar ambos os ambientes, siga as etapas nos respectivos tópicos abaixo.
  
**Nota:** O cenário CT.10 não foi possível concluir, pois o produto já está em produção.  
A interface identifica a automação como bot e retorna autorização negada.
 
## ⚙️ Configuração e Instalação — Cypress

1) **Instale o Node.js (versão LTS recomendada):**
   https://nodejs.org
2) **Clone o repositório:**
   git clone https://github.com/Guttester/Google-Automatizados.git
3) **Acesse a pasta do projeto:**
   cd Google-Automatizados
4) **Instale as dependências:**
   npm install
5) **Abra o Cypress:**
   npx cypress open
6) **Execute os testes em modo headless (opcional):**
   npx cypress run
   
**Notas:** 

- No arquivo `cypress.config.js`, foi necessário adicionar a propriedade `chromeWebSecurity` para reduzir a frequência de solicitações de CAPTCHA pelo Google, além da configuração de um `userAgent` para minimizar a detecção de automação.

- Também foi adicionada uma configuração para que o Chrome não identifique a execução como automação, utilizando `setupNodeEvents`.

## ⚙️ Configuração e Instalação — Selenium

1) **Instale o Java (JDK 17 ou superior):** https://adoptium.net
2) **Baixe o ChromeDriver compatível com sua versão do Chrome:** https://chromedriver.chromium.org ( Este arquivo é um executável `.exe` . )
4) **Configure o PATH do ChromeDriver no sistema.**
5) **Clone o repositório:** git clone https://github.com/Guttester/Google-Automatizados.git
6) **Importe o projeto na IDE (IntelliJ / Eclipse / VS Code).**
7) **Instale as dependências (Maven/Gradle).** ( Se possivel, adicione suas depedência e versões no: pom.xml )
9) **Execute os testes via JUnit/TestNG.**

**Notas:**

- Caso você crie um novo projeto baseado neste ou de forma independente, é importante criar uma pasta de origem para armazenar o arquivo de versão do `ChromeDriver`, pois é necessário informar corretamente o caminho, assim como foi definido em `Core/ElementsGoogle.java`.

- Também é importante adicionar as dependências ao projeto. Caso seja um projeto novo, clique com o botão direito no nome do projeto, vá em **Caminho de Construção**, selecione **Incluir Nova Biblioteca** e adicione o **JUnit**.

## 📌 Considerações Finais

Este projeto tem como objetivo servir como base de estudos, prática e portfólio em automação de testes.

Em caso de dúvidas, sugestões ou necessidade de ajustes pontuais, fique à vontade para entrar em contato.
Contribuições e feedbacks são bem-vindos.
