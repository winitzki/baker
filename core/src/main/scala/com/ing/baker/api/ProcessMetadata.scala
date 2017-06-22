package com.ing.baker.api

/**
  * This class is to store some metadata information of a baker process
  * @param id process id
  * @param created process created date-time
  */
case class ProcessMetadata(id: String, created: Long)