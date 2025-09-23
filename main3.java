{
  "nbformat": 4,
  "nbformat_minor": 0,
  "metadata": {
    "colab": {
      "provenance": [],
      "authorship_tag": "ABX9TyMJeRwfTeh1LqjxWGVkItUd",
      "include_colab_link": true
    },
    "kernelspec": {
      "name": "python3",
      "display_name": "Python 3"
    },
    "language_info": {
      "name": "python"
    }
  },
  "cells": [
    {
      "cell_type": "markdown",
      "metadata": {
        "id": "view-in-github",
        "colab_type": "text"
      },
      "source": [
        "<a href=\"https://colab.research.google.com/github/JuanSebastianSantos/PROGCOM-A/blob/main/main3.java\" target=\"_parent\"><img src=\"https://colab.research.google.com/assets/colab-badge.svg\" alt=\"Open In Colab\"/></a>"
      ]
    },
    {
      "cell_type": "code",
      "execution_count": null,
      "metadata": {
        "id": "LBRlOjkBRo-Q"
      },
      "outputs": [],
      "source": [
        "import java.util.*;\n",
        "\n",
        "public class Main {\n",
        "    public static void main(String[] args) {\n",
        "        String palabra = \"programacion\";\n",
        "        ArrayList<Character> vocal = new ArrayList<>();\n",
        "        for (int x = 0; x < palabra.length(); x++) {\n",
        "            char c = palabra.charAt(x);\n",
        "            if (\"aeiou\".indexOf(c) != -1) {\n",
        "                vocal.add(c);\n",
        "            }\n",
        "        }\n",
        "        System.out.println(\"vocales en la palabra (programacion):\");\n",
        "        System.out.println(vocal);\n",
        "    }\n",
        "}"
      ]
    }
  ]
}