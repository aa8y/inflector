package com.hypertino.inflector.naming

object DashCaseToCamelCaseConverter extends BaseConverter {
  protected val parser = new DashCaseParser
  protected def createBuilder(): IdentifierBuilder = new CamelCaseBuilder()
}
