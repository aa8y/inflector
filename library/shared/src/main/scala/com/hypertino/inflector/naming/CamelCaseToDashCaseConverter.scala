package com.hypertino.inflector.naming

object CamelCaseToDashCaseConverter extends BaseConverter {
  protected val parser = CamelCaseParser
  protected def createBuilder(): IdentifierBuilder = new DashCaseBuilder()
}
