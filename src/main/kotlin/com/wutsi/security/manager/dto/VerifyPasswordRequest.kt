package com.wutsi.security.manager.dto

import kotlin.String

public data class VerifyPasswordRequest(
  public val username: String = "",
  public val `value`: String = "",
)
