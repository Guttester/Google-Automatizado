
import { Elements } from "../components/elements"

describe("CT.11 - Validar acesso de termos do Google.", () => {
  it("Deve navegar para a página de Termos de Serviço com sucesso", () => {
    cy.visit(Elements.urlGoogle)
    cy.get(Elements.btnTermos)
      .should('be.visible')
      .invoke('removeAttr', 'target') 
      .click()
    cy.origin('https://policies.google.com', () => {
      cy.get('h1').should('contain', 'Termos de Serviço')
    })
  })
})