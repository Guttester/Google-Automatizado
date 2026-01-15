import { Elements } from "../components/elements"

describe("CT.05 - Validar acesso de aplicativo do youtube após o clique do incone.", () => {
  it("CT.05 - Navega ao clicar no icone.", () => {
    cy.visit(Elements.urlGoogle)
    cy.get(Elements.btnAppGoogle).click()
    cy.get('iframe[role="presentation"]')
      .its('0.contentDocument.body')
      .should('not.be.empty')
      .then(cy.wrap)
      .find(Elements.btnDrive)
      .first()
      .invoke('removeAttr', 'target')
      .click()
    cy.origin('https://accounts.google.com', () => { 
        cy.url().should('match', /google\.com/)
    })
  })
})