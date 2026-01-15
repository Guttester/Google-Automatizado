import { Elements } from "../components/elements"
import { GoogleSearch } from "../components/googleSearch.component"

describe("CT.03 - Validar pesquisa no campo de busca do google imagens.", () => {
  it("CT.03 - Pesquisar texto em imagens.", () => {
    cy.visit(Elements.urlGoogle)
    cy.xpath(Elements.btnImageXpath)
      .should('exist')
      .invoke('removeAttr', 'target')
      .click()
    //Verifica se está na tela de imagem.  
    cy.url().should('include', 'imghp')
    cy.get('textarea[name="q"]', { timeout: 10000 })
      .should('be.visible')
      .type(`${Elements.textSearch}{enter}`)
  })
})