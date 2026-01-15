
import { Elements } from "../components/elements"

describe("CT.04 - Validar listagem de aplicativos google após clique.", () => {
  it("CT.04 - Verifica View List AppGoogle", () => {
    cy.visit(Elements.urlGoogle)
    cy.get(Elements.btnAppGoogle).click()
    cy.get('iframe[role="presentation"]', { timeout: 10000 })
        .should('be.visible')
        .and(($iframe) => {
            //Verifica o tamanho do iframe.
            expect($iframe.width()).to.be.greaterThan(0)
        })
    })
})
