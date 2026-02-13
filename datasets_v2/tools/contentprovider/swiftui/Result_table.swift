import SwiftUI

struct Result_table: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      ZStack {
        Text("Content Provider:").padding(.trailing, 4.0)
        Text("").frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
        Text("Filter:").padding(.trailing, 4.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        Text("").frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
        Text("Rows:").padding(.trailing, 4.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        Text("-").frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 5.0)
      .padding(.bottom, 5.0)
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Result_table_Previews: PreviewProvider {
  static var previews: some View {
    Result_table()
  }
}
