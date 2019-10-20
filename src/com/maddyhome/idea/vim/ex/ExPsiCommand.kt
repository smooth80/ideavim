package com.maddyhome.idea.vim.ex

import com.intellij.psi.PsiElement
import com.maddyhome.idea.vim.ex.ranges.Ranges

class ExPsiCommand(
  command: String,
  val element: PsiElement
) : ExCommand(Ranges(), command, "")
