import { Elements } from "../components/elements"
import { GoogleSearch } from "../components/googleSearch.component"

describe("CT.12 - Validar clique no primeiro bloco 'As pessoas também perguntam'", () => {
  it("Deve pesquisar e expandir a primeira pergunta do bloco", () => {
    cy.visit(Elements.urlGoogle)
    GoogleSearch.typeAndSearch()

    cy.get('div[data-initq]', { timeout: 20000 })
      .first()
      .scrollIntoView()
      .should("be.visible")
      
    cy.get('div[data-initq]', { timeout: 20000 })
      .first()
      .within(() => {
        cy.get('div[role="button"][aria-expanded], [role="button"][aria-expanded], [aria-expanded]', {
          timeout: 15000,
        })
          .first()
          .as("firstQuestion")
      })

    cy.get("@firstQuestion")
      .scrollIntoView()
      .should("be.visible")
      .click()

    cy.get("@firstQuestion").then(($el) => {
      const expanded = $el.attr("aria-expanded")
      if (expanded !== "true") {
        cy.wrap($el).click()
      }
    })

    cy.get("@firstQuestion", { timeout: 15000 })
      .should("have.attr", "aria-expanded", "true")
  })
})
