import { Elements } from "./elements"

export const GoogleSearch = {
  typeAndSearch() {
    return cy
      .get(Elements.inputSearch)
      .type(`${Elements.textSearch}{enter}`)
  },
};