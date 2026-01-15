import { Elements } from "../components/elements"

describe("CT.08 - Validar acesso de aplicativo do Maps após o clique do ícone.", () => {
  it("CT.08 - Navega ao clicar no ícone do Maps.", () => {
    cy.visit(Elements.urlGoogle)
    cy.get(Elements.btnAppGoogle).click()
    cy.get('iframe[role="presentation"]')
      .its('0.contentDocument.body')
      .should('not.be.empty')
      .then(cy.wrap)
      .find(Elements.btnMaps)
      .first()
      .then(($el) => {
        const url = $el.prop('href')
        cy.visit(url)
      })
    cy.url({ timeout: 15000 }).should('match', /google\..*maps/)
  })
})