
import { Elements } from "../components/elements"

describe("CT.09 - Validar clique no button fazer login.", () => {
  it("CT.09 - Validar clique no button fazer login.", () => {
    cy.visit(Elements.urlGoogle)
    Elements.btnLogin().click()
  })
})