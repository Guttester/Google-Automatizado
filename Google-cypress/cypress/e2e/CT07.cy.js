import { Elements } from "../components/elements"

describe("CT.07 - Validar acesso de aplicativo do Gmail após o clique do ícone.", () => {
  it("CT.07 - Navega ao clicar no ícone do Gmail.", () => {
    cy.visit(Elements.urlGoogle)
    cy.get(Elements.btnAppGoogle).click()

    cy.get('iframe[role="presentation"]')
      .its('0.contentDocument.body')
      .should('not.be.empty')
      .then(cy.wrap)
      .find(Elements.btnGmail)
      .first()
        .then(($el) => {
            const url = $el.prop('href')
            cy.visit(url)
        })
    cy.url().should('match', /gmail|mail\.google\.com/)
  })
})