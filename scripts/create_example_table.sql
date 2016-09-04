USE [exampledb]
GO

/****** Object:  Table [dbo].[exampletable]    Script Date: 9/4/2016 6:12:11 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[exampletable](
	[pk] [int] IDENTITY(1,1) NOT NULL,
	[FirstParam] [int] NULL,
	[SecondParam] [int] NULL,
	[Operation] [varchar](50) NULL,
	[Answer] [int] NULL
) ON [PRIMARY]

GO

