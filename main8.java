{
  "nbformat": 4,
  "nbformat_minor": 0,
  "metadata": {
    "colab": {
      "provenance": [],
      "authorship_tag": "ABX9TyN+L7NxqNnFa0J4BdVTYXR7",
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
        "<a href=\"https://colab.research.google.com/github/JuanSebastianSantos/PROGCOM-A/blob/main/main8.java\" target=\"_parent\"><img src=\"https://colab.research.google.com/assets/colab-badge.svg\" alt=\"Open In Colab\"/></a>"
      ]
    },
    {
      "cell_type": "code",
      "execution_count": null,
      "metadata": {
        "id": "urDLD1R6SzMY"
      },
      "outputs": [],
      "source": [
        "import java.util.*;\n",
        "\n",
        "public class Main {\n",
        "    public static void main(String[] args) {\n",
        "        List<String> palabras = Arrays.asList(\"sol\", \"estrella\", \"mar\", \"planeta\");\n",
        "        List<String> resultado = new ArrayList<>();\n",
        "\n",
        "        for (String p : palabras) {\n",
        "            if (p.length() > 4) {\n",
        "                resultado.add(p);\n",
        "            }\n",
        "        }\n",
        "\n",
        "        System.out.println(\"Palabras con más de 4 letras: \" + resultado);\n",
        "    }\n",
        "}"
      ]
    }
  ]
}